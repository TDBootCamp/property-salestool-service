package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Pekerjaan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PekerjaanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pekerjaan> getPekerjaan(){
        String SQL = "select id_pekerjaan as idPekerjaan, nm_pekerjaan as namaPekerjaan from m_pekerjaan";
        List<Pekerjaan> pkj = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Pekerjaan.class));
        return pkj;
    }
    
}
