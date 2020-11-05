package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.HubDenganPelapor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HubDenganPelaporJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<HubDenganPelapor> getHubDenganPelapor(){
        String SQL = "select ket_hubungan_pelapor as ketHubPelapor, kode_hubungan_pelapor as kodeHubPelapor, id_hubungan_pelapor as idHubPelapor from m_hubungan_dengan_pelapor";
        List<HubDenganPelapor> hp = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(HubDenganPelapor.class));
        return hp;
    }
    
}
