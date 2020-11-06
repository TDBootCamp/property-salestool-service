package com.property.service.model.customer;

import java.sql.Date;
import java.sql.Timestamp;

import com.property.service.model.GolDeb;
import com.property.service.model.Identitas;
import com.property.service.model.Kecamatan;
import com.property.service.model.Kelurahan;
import com.property.service.model.KodePos;
import com.property.service.model.KotaKab;
import com.property.service.model.Propinsi;

import lombok.Data;

@Data
public class CustPerorangan {

    private int idNasabahPerorangan;
    private String idEntry;
    private String idUpdate;
    private Timestamp dEntry;
    private Timestamp dUpdate;
    private String alamatDomisili;
    private String alamatEmail;
    private String alamatIdentitas;
    private String gelarDepan;
    private String gelarBelakang;
    private Boolean isBlacklist;
    private String ketDiblacklist;
    private String namaIdentitas;
    private String namaNasabah;
    private String noIdentitas;
    private String noMobile;
    private String noNpwp;
    private String noTelp;
    private String noRegNasabah;
    private Boolean statSeumurHidupId;
    private Timestamp dBlacklist;
    private Date tglKadaluarsaId;
    private int tipeIdentitas;
    private int idBpr;
    private int idGolDeb;
    private String golDebKet;
    private String kodeGoldeb;
    private String kategoriGoldeb;
    private long idKecDomisili;
    private long idKecIdentitas;
    private String namaKecamatan;
    private long idKelDomisili;
    private long idKelIdentitas;
    private String namaKelurahan;
    private int idKodePosDomisili;
    private int idKodePosIdentitas;
    private String kodepos;
    private int idKotaKabDomisili;
    private int idKotaKabIdentitas;
    private String namaKotaKab;
    private int idPropDomisili;
    private int idPropIdentitas;
    private String namaPropinsi;
    private Boolean domisiliSesuaiIdentitas;
    private String bprCabang;
    private double saldoTabunganDeposito;
    
}
