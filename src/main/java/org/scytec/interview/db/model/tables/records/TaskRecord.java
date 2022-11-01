/*
 * This file is generated by jOOQ.
 */
package org.scytec.interview.db.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.scytec.interview.db.model.tables.Task;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskRecord extends UpdatableRecordImpl<TaskRecord> implements Record3<Long, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.TASK.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.TASK.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.TASK.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.TASK.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.TASK.REWARD</code>.
     */
    public void setReward(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.TASK.REWARD</code>.
     */
    public Integer getReward() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Task.TASK.ID;
    }

    @Override
    public Field<String> field2() {
        return Task.TASK.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Task.TASK.REWARD;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getReward();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getReward();
    }

    @Override
    public TaskRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TaskRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TaskRecord value3(Integer value) {
        setReward(value);
        return this;
    }

    @Override
    public TaskRecord values(Long value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskRecord
     */
    public TaskRecord() {
        super(Task.TASK);
    }

    /**
     * Create a detached, initialised TaskRecord
     */
    public TaskRecord(Long id, String name, Integer reward) {
        super(Task.TASK);

        setId(id);
        setName(name);
        setReward(reward);
    }
}
