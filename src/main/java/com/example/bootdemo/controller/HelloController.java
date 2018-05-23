package com.example.bootdemo.controller;

import com.example.bootdemo.beans.Account;
import com.example.bootdemo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private ITestService ITestService;

    @RequestMapping("/test")
    public String test(){
        ITestService.test();
        return "aaaa";
    }

    @RequestMapping("/go")
    public String go(){
        ITestService.test();
        return "bbbb";
    }

    @RequestMapping("/add")
    public String add(){
        Account account = new Account();
        account.setId(1);
        account.setName("jack");
        ITestService.add(account);
        return "success";
    }
}
