package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Barang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BarangJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Barang> getBarang(){
        String SQL = "select id, barang from m_barang";
        List<Barang> brg = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Barang.class));
        return brg;
    }
    
}
