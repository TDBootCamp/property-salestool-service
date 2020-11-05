package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.JabPengurusPemilik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JabPengurusPemilikJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<JabPengurusPemilik> getJabPengurusPemilik(){
        String SQL = "select kode_jabatan_pengurus_pemilik as kodeJabPengurusPemilik, nama_jabatan_pengurus_pemilik as namaJabPengurusPemilik, id from m_jab_pengurus_pemilik";
        List<JabPengurusPemilik> jpp = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(JabPengurusPemilik.class));
        return jpp;
    }
    
}
