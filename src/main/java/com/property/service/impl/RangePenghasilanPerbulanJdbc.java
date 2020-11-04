package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.RangePenghasilanPerbulan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RangePenghasilanPerbulanJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<RangePenghasilanPerbulan> getRangePenghasilanPerbulan(){
        String SQL = "select id, ket from m_range_penghasilan_perbulan";
        List<RangePenghasilanPerbulan> range = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(RangePenghasilanPerbulan.class));
        return range;
    }
    
}
