package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.KotaKab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KotaKabJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KotaKab> getKotaKab(){
        String SQL = "select id_kota_kab as idKotaKab, nm_kota_kab as namaKotaKab from m_kota_kab";
        List<KotaKab> al = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(KotaKab.class));
        return al;
    }
    
}
