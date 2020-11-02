package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Agama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AgamaJdbc {
    
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Agama> getAgama(){
        String SQL = "select id as idAgama, agama from m_agama";
        List<Agama> al = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Agama.class));
        return al;
    }

}
