package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.JenisPenggunaan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JenisPenggunaanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<JenisPenggunaan> getJenisPenggunaan(){
        String SQL = "select jenis_pengunaan_id as jenisPenggunaanId, jenis_penggunaan as jenisPenggunaan, kode_jenis_penggunaan as kodeJenisPenggunaan, kode_labul as kodeLabul from m_jenis_pengunaan";
        List<JenisPenggunaan> jenis = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(JenisPenggunaan.class));
        return jenis;
    }
    
}
