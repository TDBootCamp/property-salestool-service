package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.DaftarCekDokumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaftarCekDokumenJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DaftarCekDokumen> getDaftarCekDokumen(){
        String SQL = "select id, kategori_cek as kategoriCek, kriteria_cek as kriteriaCek, peruntukan_cek as peruntukanCek from m_daftar_cek_dokumen";
        List<DaftarCekDokumen> dcd = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(DaftarCekDokumen.class));
        return dcd;
    }
    
}
