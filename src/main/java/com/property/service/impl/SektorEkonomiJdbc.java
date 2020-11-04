package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.SektorEkonomi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SektorEkonomiJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SektorEkonomi> getSektorEkonomi(){
        String SQL = "select kode_sektor as kodeSektor, nama_sektor as namaSektor from m_sektor_ekonomi";
        List<SektorEkonomi> sektor = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(SektorEkonomi.class));
        return sektor;
    }
    
}
