package com.oldli.admin.service;

import com.oldli.admin.entity.Account;
import com.oldli.admin.vo.AccountQueryModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    List<Account> query(AccountQueryModel model);
}
