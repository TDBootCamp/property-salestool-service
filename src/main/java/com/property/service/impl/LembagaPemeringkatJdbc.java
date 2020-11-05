package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.LembagaPemeringkat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LembagaPemeringkatJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<LembagaPemeringkat> getLembagaPemeringkat(){
        String SQL = "select id_lembaga_pemeringkat as idLembagaPemeringkat, kode_lembaga_pemeringkat as kodeLembagaPemeringkat, nama_lembaga_pemeringkat as namaLembagaPemeringkat from m_lembaga_pemeringkat";
        List<LembagaPemeringkat> lp = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(LembagaPemeringkat.class));
        return lp;
    }
    
}
