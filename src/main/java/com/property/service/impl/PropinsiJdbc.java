package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Propinsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PropinsiJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Propinsi> getPropinsi(){
        String SQL = "select id_propinsi as idPropinsi, nm_propinsi as namaPropinsi from m_propinsi";
        List<Propinsi> prop = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Propinsi.class));
        return prop;
    }
    
}
