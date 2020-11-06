package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.KodeArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KodeAreaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KodeArea> getKodeArea(){
        String SQL = "select id, kode_area as kodeArea from m_kode_area";
        List<KodeArea> ka = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(KodeArea.class));
        return ka;
    }
    
}
