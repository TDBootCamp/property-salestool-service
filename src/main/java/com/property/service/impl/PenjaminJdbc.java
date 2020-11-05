package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Penjamin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PenjaminJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Penjamin> getPenjamin(){
        String SQL = "select id, kode_penjamin as kodePenjamin, nama_penjamin as namaPenjamin from m_penjamin";
        List<Penjamin> penjamin = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Penjamin.class));
        return penjamin;
    }
    
}
