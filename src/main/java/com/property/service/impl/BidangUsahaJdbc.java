package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.BidangUsaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BidangUsahaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BidangUsaha> getBidangUsaha(){
        String SQL = "select id_bidang_usaha as idBidangUsaha, nm_bidang_usaha as namaBidangUsaha, kode_bidang_usaha as kodeBidangUsaha from m_bidang_usaha";
        List<BidangUsaha> bdu = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(BidangUsaha.class));
        return bdu;
    }
    
}
