package com.example.bootdemo.dao.impl;

import com.example.bootdemo.beans.Account;
import com.example.bootdemo.dao.ITestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ITestDaoImpl implements ITestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(id, name) values(?, ?)",
                account.getId(),account.getName());
    }
}
