package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.SurveyTanya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SurveyTanyaJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SurveyTanya> getSurveyTanya(){
        String SQL = "select id, bobot_pertanyaan as bobotPertanyaan, nama_pertanyaan as namaPertanyaan from m_survey_tanya";
        List<SurveyTanya> stanya = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(SurveyTanya.class));
        return stanya;
    }
    
}
