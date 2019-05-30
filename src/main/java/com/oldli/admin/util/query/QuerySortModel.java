package com.oldli.admin.util.query;

import com.oldli.admin.util.enums.SortType;

public class QuerySortModel {
    /**
     * 排序字段
     */
    private String field;

    /**
     * 排序类型
     */
    private SortType sortType;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }
}
