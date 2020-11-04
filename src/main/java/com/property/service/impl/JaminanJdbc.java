package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Jaminan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JaminanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Jaminan> getJaminan(){
        String SQL = "select id, kode, nama from m_jaminan";
        List<Jaminan> jamin = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Jaminan.class));
        return jamin;
    }
    
}
