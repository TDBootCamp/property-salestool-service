package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.KategoriJaminan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KategoriJaminanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KategoriJaminan> getKategoriJaminan(){
        String SQL = "select id, kode, nama from m_jaminan";
        List<KategoriJaminan> kat = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(KategoriJaminan.class));
        return kat;
    }
    
}
