package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Instansi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InstansiJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Instansi> getInstansi(){
        String SQL = "select id, alamat_instansi as alamatInstansi, nomor_fax as nomorFax, kode_instansi as kodeInstansi, nama_instansi as namaInstansi, nama_kontak_person as namaKontakPerson, nomor_telphone asnomorTelephone from m_instansi";
        List<Instansi> ins = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Instansi.class));
        return ins;
    }
    
}
