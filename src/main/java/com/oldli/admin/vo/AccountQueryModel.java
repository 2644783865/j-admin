package com.oldli.admin.vo;

import com.oldli.admin.util.query.QueryModel;

/**
 * 账户查询模型
 */
public class AccountQueryModel extends QueryModel {

    /**
     * 用户名
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
