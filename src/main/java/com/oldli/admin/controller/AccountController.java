package com.oldli.admin.controller;

import com.oldli.admin.entity.Account;
import com.oldli.admin.service.AccountService;
import com.oldli.admin.vo.AccountQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/api/account/query", method = RequestMethod.GET)
    @ResponseBody
    public List<Account> Query(AccountQueryModel model) {

        List<Account> list = accountService.query(model);
        return list;
    }
}
