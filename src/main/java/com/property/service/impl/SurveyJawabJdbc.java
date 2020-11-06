package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.SurveyJawab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SurveyJawabJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SurveyJawab> getSurveyJawab(){
        String SQL = "select id, nama_jawaban as namaJawaban, skor from m_survey_jawab";
        List<SurveyJawab> sjawab = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(SurveyJawab.class));
        return sjawab;
    }
    
}
