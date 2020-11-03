package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Kelurahan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KelurahanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // public List<Kelurahan> getKelurahan(){
    //     String SQL = "select id_kelurahan as idKelurahan, nm_kelurahan as namaKelurahan from m_kelurahan";
    //     List<Kelurahan> kel = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Kelurahan.class));
    //     return kel;
    // }

    public List<Kelurahan> getKelurahan(){
        String SQL = "select id_kelurahan as idKelurahan, nm_kelurahan as namaKelurahan from m_kelurahan";
        List<Kelurahan> kec = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Kelurahan.class));
        return kec;
    }
    
}
