package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.KodePos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KodePosJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KodePos> getKodePos(){
        String SQL = "select id as idKodePos, kodepos from m_kode_pos";
        List<KodePos> pos = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(KodePos.class));
        return pos;
    }
    
}
