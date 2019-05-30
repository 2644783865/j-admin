package com.oldli.admin.util.query;

/**
 * 查询模型
 */
public abstract class QueryModel {

    /**
     * 分页模型
     */
    private QueryPagingModel paging;

    /**
     * 总数
     */
    private int totalCount;

    public QueryPagingModel getPaging() {
        return paging;
    }

    public void setPaging(QueryPagingModel paging) {
        this.paging = paging;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
