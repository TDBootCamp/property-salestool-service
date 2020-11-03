package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Jabatan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JabatanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Jabatan> getJabatan(){
        String SQL = "select kode_jabatan as kodeJabatan, nama_jabatan as namaJabatan from m_jabatan";
        List<Jabatan> jabat = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Jabatan.class));
        return jabat;
    }
    
}
