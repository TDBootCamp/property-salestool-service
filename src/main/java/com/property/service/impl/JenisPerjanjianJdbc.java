package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.JenisPerjanjian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JenisPerjanjianJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<JenisPerjanjian> getJenisPerjanjian(){
        String SQL = "select id, kode, nama from m_jenis_perjanjian";
        List<JenisPerjanjian> janji = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(JenisPerjanjian.class));
        return janji;
    }
    
}
