package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Restrukturisasi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RestrukturisasiJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Restrukturisasi> getRestrukturisasi(){
        String SQL = "select id, kode, restrukturisasi_ket as restrukturisasiKet from m_restrukturisasi";
        List<Restrukturisasi> re = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Restrukturisasi.class));
        return re;
    }
    
}
