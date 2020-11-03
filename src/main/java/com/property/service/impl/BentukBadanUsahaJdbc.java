package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.BentukBadanUsaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BentukBadanUsahaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BentukBadanUsaha> getBentukBadanUsaha(){
        String SQL = "select id_jenis_badanusaha as idJenisBadanUsaha, n_jenis_badanusaha as namaJenisBadanUsaha, kode_bentuk_usaha as kodeBentukUsaha from m_bentuk_badanusaha";
        List<BentukBadanUsaha> bu = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(BentukBadanUsaha.class));
        return bu;
    }
    
}
