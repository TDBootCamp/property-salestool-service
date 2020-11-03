package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Pendidikan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PendidikanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pendidikan> getPendidikan(){
        String SQL = "select kode_pendidikan as kodePendidikan, pendidikan from m_pendidikan";
        List<Pendidikan> pend = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Pendidikan.class));
        return pend;
    }
    
}
