/*
 * This file is generated by jOOQ.
 */
package org.scytec.interview.db.model;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.scytec.interview.db.model.tables.Clan;
import org.scytec.interview.db.model.tables.ClanHistory;
import org.scytec.interview.db.model.tables.Task;
import org.scytec.interview.db.model.tables.UserProfile;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.CLAN</code>.
     */
    public final Clan CLAN = Clan.CLAN;

    /**
     * The table <code>PUBLIC.CLAN_HISTORY</code>.
     */
    public final ClanHistory CLAN_HISTORY = ClanHistory.CLAN_HISTORY;

    /**
     * The table <code>PUBLIC.TASK</code>.
     */
    public final Task TASK = Task.TASK;

    /**
     * The table <code>PUBLIC.USER_PROFILE</code>.
     */
    public final UserProfile USER_PROFILE = UserProfile.USER_PROFILE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Clan.CLAN,
            ClanHistory.CLAN_HISTORY,
            Task.TASK,
            UserProfile.USER_PROFILE
        );
    }
}
