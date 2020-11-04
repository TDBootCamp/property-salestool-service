package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.SumberPenghasilan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SumberPenghasilanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SumberPenghasilan> getSumberPenghasilan(){
        String SQL = "select id_sumber_dana as idSumberDana, sumberdana from m_sumber_penghasilan";
        List<SumberPenghasilan> hasil = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(SumberPenghasilan.class));
        return hasil;
    }
    
}
