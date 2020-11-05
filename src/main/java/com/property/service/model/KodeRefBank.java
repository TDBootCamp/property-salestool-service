package com.property.service.model;

public class KodeRefBank {

    private int id;
    private String nama;
    private String kode;
    private String singkatan;
    private String bprId;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getSingkatan() {
        return this.singkatan;
    }

    public void setSingkatan(String singkatan) {
        this.singkatan = singkatan;
    }

    public String getBprId() {
        return this.bprId;
    }

    public void setBprId(String bprId) {
        this.bprId = bprId;
    }
    
}
