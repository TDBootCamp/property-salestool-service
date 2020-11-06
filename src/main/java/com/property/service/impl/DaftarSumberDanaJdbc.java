package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.DaftarSumberDana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaftarSumberDanaJdbc {

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DaftarSumberDana> getDaftarSumberDana(){
        String SQL = "select id_sumber_dana as idSumberDana, sumberdana from m_daftar_sumber_dana";
        List<DaftarSumberDana> dsd = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(DaftarSumberDana.class));
        return dsd;
    }
    
}
