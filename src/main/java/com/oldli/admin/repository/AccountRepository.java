package com.oldli.admin.repository;

import com.oldli.admin.entity.Account;
import com.oldli.admin.vo.AccountQueryModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountRepository {
    /**
     * 查询列表
     *
     * @param model 模型
     * @return
     */
    List<Account> query(AccountQueryModel model);
}
