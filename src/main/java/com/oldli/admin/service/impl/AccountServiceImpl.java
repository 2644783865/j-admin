package com.oldli.admin.service.impl;

import com.oldli.admin.entity.Account;
import com.oldli.admin.repository.AccountRepository;
import com.oldli.admin.vo.AccountQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements com.oldli.admin.service.AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public List<Account> query(AccountQueryModel model) {
        return repository.query(model);
    }
}
