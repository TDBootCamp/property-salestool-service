package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.GolDeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GolDebJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<GolDeb> getGolDeb(){
        String SQL = "select gol_deb_id as golDebId, gol_deb_ket as golDebKet, kode_goldeb as kodeGoldeb, kategori_goldeb as kategoriGoldeb from m_gol_deb";
        List<GolDeb> gd = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(GolDeb.class));
        return gd;
    }
    
}
