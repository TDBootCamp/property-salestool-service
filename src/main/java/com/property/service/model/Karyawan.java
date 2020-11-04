package com.property.service.model;

import java.sql.Date;

public class Karyawan {
    
    private int idKaryawan;
    private String kodeNpk;
    private String namaKaryawan;
    private Date tanggalMasukStaff;
    private int idKantor;
    private String idKantorCabang;
    private int idDepartmen;
    private String nik;
    private String noTelp;
    private String email;
    private String alamatTinggal;
    private int kotaLahir;
    private String namaKotaLahir;
    private KotaKab kotaKab;
    private String kodeMarketing;

    public int getIdKaryawan() {
        return this.idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getKodeNpk() {
        return this.kodeNpk;
    }

    public void setKodeNpk(String kodeNpk) {
        this.kodeNpk = kodeNpk;
    }

    public String getNamaKaryawan() {
        return this.namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public Date getTanggalMasukStaff() {
        return this.tanggalMasukStaff;
    }

    public void setTanggalMasukStaff(Date tanggalMasukStaff) {
        this.tanggalMasukStaff = tanggalMasukStaff;
    }

    public int getIdKantor() {
        return this.idKantor;
    }

    public void setIdKantor(int idKantor) {
        this.idKantor = idKantor;
    }

    public String getIdKantorCabang() {
        return this.idKantorCabang;
    }

    public void setIdKantorCabang(String idKantorCabang) {
        this.idKantorCabang = idKantorCabang;
    }

    public int getIdDepartmen() {
        return this.idDepartmen;
    }

    public void setIdDepartmen(int idDepartmen) {
        this.idDepartmen = idDepartmen;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamatTinggal() {
        return this.alamatTinggal;
    }

    public void setAlamatTinggal(String alamatTinggal) {
        this.alamatTinggal = alamatTinggal;
    }

    public int getKotaLahir() {
        return this.kotaLahir;
    }

    public void setKotaLahir(int kotaLahir) {
        this.kotaLahir = kotaLahir;
    }

    public String getNamaKotaLahir() {
        return this.namaKotaLahir;
    }

    public void setNamaKotaLahir(String namaKotaLahir) {
        this.namaKotaLahir = namaKotaLahir;
    }

    public KotaKab getKotaKab() {
        return this.kotaKab;
    }

    public void setKotaKab(KotaKab kotaKab) {
        this.kotaKab = kotaKab;
    }

    public String getKodeMarketing() {
        return this.kodeMarketing;
    }

    public void setKodeMarketing(String kodeMarketing) {
        this.kodeMarketing = kodeMarketing;
    }

}
