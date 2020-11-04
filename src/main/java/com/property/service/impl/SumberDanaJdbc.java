package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.SumberDana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SumberDanaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SumberDana> getSumberDana(){
        String SQL = "select id, sumber_dana as sumberDana from m_sumber_dana";
        List<SumberDana> dana = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(SumberDana.class));
        return dana;
    }
    
}
