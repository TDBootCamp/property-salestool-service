package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.StatusKawin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatusKawinJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<StatusKawin> getStatusKawin(){
        String SQL = "select id, status_kawin as statusKawin from m_status_kawin";
        List<StatusKawin> sk = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(StatusKawin.class));
        return sk;
    }
    
}
