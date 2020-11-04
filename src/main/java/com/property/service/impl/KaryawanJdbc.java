package com.property.service.impl;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.Karyawan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KaryawanJdbc {
    
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Karyawan> getKaryawan(){
        String SQL = "select kr.id as idKaryawan, kr.kode_npk as kodeNpk, kr.nama_jabatan as namaKaryawan, " +
                     "kr.tanggal_masuk_staff as tanggalMasukStaff, kr.id_kantor as idKantor, " +
                     "kr.id_kantor_cabang as idKantorCabang, kr.id_department as idDepartmen, " +
                     "kr.nomor_induk_kependudukan as nik, kr.nomor_telepon as noTelp, kr.alamat_email as email, " +
                     "kr.alamat_tinggal as alamatTinggal, kr.kota_lahir as kotaLahir, kr.kode_marketing as kodeMarketing, " +
                     "kol.nm_kota_kab from m_karyawan kr join m_kota_kab kol on kr.kota_lahir = kol.id_kota_kab";
        List<Karyawan> la = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Karyawan.class));
        return la;
    }

    public void insertKaryawan(Karyawan karyawan){
        String sql = "insert into m_karyawan (id,id_entry,d_entry,kode_npk,nama_jabatan,tanggal_masuk_staff,id_kantor," +
                     "id_department,nomor_induk_kependudukan,nomor_telepon,alamat_email,alamat_tinggal,kota_lahir,kode_marketing) " +
                     "values (?,?,'2017-04-11 13:27:12',?,?,'2017-04-11 13:27:12',?,5,?,?,?,?,?,?)";
        Object param[] = {karyawan.getIdKaryawan(), "admin_ultra", karyawan.getKodeNpk(), karyawan.getNamaKaryawan(), karyawan.getIdKantor(),
                          karyawan.getNik(), karyawan.getNoTelp(),
                          karyawan.getEmail(),karyawan.getAlamatTinggal(), karyawan.getKotaLahir(), karyawan.getKodeMarketing()};
        jdbcTemplate.update(sql, param);
    }

}
