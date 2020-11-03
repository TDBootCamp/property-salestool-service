package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Kecamatan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KecamatanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Kecamatan> getKecamatan(){
        String SQL = "select id_kecamatan as idKecamatan, nm_kec as namaKecamatan from m_kecamatan";
        List<Kecamatan> kec = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Kecamatan.class));
        return kec;
    }
    
}
