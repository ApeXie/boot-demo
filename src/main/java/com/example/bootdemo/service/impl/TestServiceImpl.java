package com.example.bootdemo.service.impl;

import com.example.bootdemo.beans.Account;
import com.example.bootdemo.dao.ITestDao;
import com.example.bootdemo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ITestDao iTestDao;

    @Override
    public void test() {
        System.out.println("bbbb");
    }

    @Override
    public void add(Account account) {
        iTestDao.add(account);
    }
}
