package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.HubKeluarga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HubKeluargaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<HubKeluarga> getHubKeluarga(){
        String SQL = "select id_hub_keluarga as idHubKeluarga, nm_hub_keluarga as namaHubKeluarga from m_hub_keluarga";
        List<HubKeluarga> hk = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(HubKeluarga.class));
        return hk;
    }
    
}
