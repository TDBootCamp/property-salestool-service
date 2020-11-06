package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Identitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IdentitasJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Identitas> getIdentitas(){
        String SQL = "select identitasid, tipe_identitas as tipeIdentitas from m_identitas";
        List<Identitas> id = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Identitas.class));
        return id;
    }
    
}
