package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Department> getDepartment(){
        String SQL = "select id, kode_department as kodeDepartment, nama_department as namaDepartment from m_department";
        List<Department> al = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Department.class));
        return al;
    }
    
}
