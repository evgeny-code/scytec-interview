package org.scytec.interview.services;


import org.scytec.interview.pojo.Action;
import org.scytec.interview.pojo.Clan;
import org.scytec.interview.pojo.ClanHistory;
import org.scytec.interview.pojo.User;

import java.time.LocalDateTime;

public enum UserAddGoldService {
    INSTANCE;


    public void addGoldToClan(long userId, long clanId, int gold) {
        try {
            DbFacade.INSTANCE.userLock.lock(userId);

            User user = DbFacade.INSTANCE.getUser(userId);
            try {
                DbFacade.INSTANCE.clanLock.lock(clanId);

                Clan clan = DbFacade.INSTANCE.getClan(clanId);
                while (true) {
                    int goldFrom = clan.getGold().get();
                    int userGoldFrom = user.getGold().get();

                    if (gold > userGoldFrom)
                        throw new IllegalArgumentException("Not enough gold");

                    if (goldFrom + gold == clan.addGold(gold)
                            && userGoldFrom - gold == user.addGold(-gold)) {

                        DbFacade.INSTANCE.updateTogether(clan, user);

                        DbFacade.INSTANCE.clanHistorySetForSave
                                .add(ClanHistory.builder()
                                        .action(Action.ADD_GOLD_TO_CLAN.name())
                                        .dateTime(LocalDateTime.now())
                                        .clanId(clanId)
                                        .userId(userId)
                                        .goldFrom(goldFrom)
                                        .goldTo(goldFrom + gold)
                                        .build());
                        break;
                    }
                }
            } finally {
                DbFacade.INSTANCE.clanLock.unlock(clanId);
            }
        } finally {
            DbFacade.INSTANCE.userLock.unlock(userId);
        }
    }
}