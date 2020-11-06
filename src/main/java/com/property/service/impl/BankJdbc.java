package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Bank> getBank(){
        String SQL = "select id, bank from m_bank";
        List<Bank> bank = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Bank.class));
        return bank;
    }
    
}
