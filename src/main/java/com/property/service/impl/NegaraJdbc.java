package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Negara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NegaraJdbc {
    
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Negara> getNegara(){
        String SQL = "select id_negara as idNegara, nm_negara as namaNegara from m_negara";
        List<Negara> al = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Negara.class));
        return al;
    }

}
