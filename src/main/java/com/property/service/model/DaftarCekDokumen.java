package com.property.service.model;

public class DaftarCekDokumen {

    private int id;
    private String kategoriCek;
    private String kriteriaCek;
    private String peruntukanCek;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoriCek() {
        return this.kategoriCek;
    }

    public void setKategoriCek(String kategoriCek) {
        this.kategoriCek = kategoriCek;
    }

    public String getKriteriaCek() {
        return this.kriteriaCek;
    }

    public void setKriteriaCek(String kriteriaCek) {
        this.kriteriaCek = kriteriaCek;
    }

    public String getPeruntukanCek() {
        return this.peruntukanCek;
    }

    public void setPeruntukanCek(String peruntukanCek) {
        this.peruntukanCek = peruntukanCek;
    }
    
}
