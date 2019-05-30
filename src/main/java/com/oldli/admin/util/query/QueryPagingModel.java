package com.oldli.admin.util.query;

import java.util.List;

/**
 * 查询分页模型
 */
public class QueryPagingModel {

    /**
     * 当前页
     */
    private int index;

    /**
     * 页大小
     */
    private int size;

    /**
     * 排序信息
     */
    private List<QuerySortModel> sort;
}
