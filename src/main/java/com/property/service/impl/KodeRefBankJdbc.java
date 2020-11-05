package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.KodeRefBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KodeRefBankJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KodeRefBank> getKodeRefBank(){
        String SQL = "select id, nama, kode, singkatan, bpr_id as bprId from m_kode_ref_bank";
        List<KodeRefBank> refbank = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(KodeRefBank.class));
        return refbank;
    }
    
}
