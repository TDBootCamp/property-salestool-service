package com.property.service.impl.customer;

import java.util.List;

import javax.sql.DataSource;

import com.property.service.model.customer.CustPerorangan;
import com.property.service.model.dataTables.DataTablesRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustPeroranganJdbc {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CustPerorangan> getCustPerorangan(){
        String SQL = "select cp.id_nasabah_perorangan as idNasabahPerorangan, cp.id_entry as idEntry, cp.id_update as idUpdate, " +
                     "cp.d_entry as dEntry, cp.d_update as dUpdate, cp.alamat_domisili as alamatDomisili, " +
                     "cp.alamat_email as alamatEmail, cp.alamat_identitas as alamatIdentitas, cp.gelar_belakang as gelarBelakang, " +
                     "cp.gelar_depan as gelarDepan, cp.is_blacklist as isBlacklist, cp.keterangan_diblacklist as ketDiblacklist, " +
                     "cp.nama_identitas as namaIdentitas, cp.nama_nasabah as namaNasabah, cp.no_identitas as noIdentitas, " +
                     "cp.no_mobile as noMobile, cp.no_npwp as noNpwp, cp.no_telp as noTelp, cp.nomor_register_nasabah as noRegNasabah, " +
                     "cp.status_seumur_hidup_identitas as statSeumurHidupId, cp.tipe_identitas as tipeIdentitas, cp.id_bpr as idBpr, " +
                     "cp.id_gol_deb as idGolDeb, cp.id_kecamatan_domisili as idKecDomisili, cp.id_kecamatan_identitas as idKecIdentitas, " +
                     "cp.id_kelurahan_domisili as idKelDomisili, cp.id_kelurahan_identitas as idKelIdentitas, " + 
                     "cp.id_kode_pos_domisili as idKodePosDomisili, cp.id_kode_pos_identitas as idKodePosIdentitas, " +
                     "cp.id_kota_kabupaten_domisili as idKotaKabDomisili, cp.id_kota_kabupaten_identitas as idKotaKabIdentitas, " +
                     "cp.id_propinsi_domisili as idPropDomisili, cp.id_propinsi_identitas as idPropIdentitas, " +
                     "cp.domisili_sesuai_identitas as domisiliSesuaiIdentitas, cp.bpr_cabang as bprCabang, "+
                     "cp.saldo_tabungan_deposito as saldoTabunganDeposito, " +
                     "gd.gol_deb_ket as golDebKet, gd.kode_goldeb as kodeGoldeb, gd.kategori_goldeb as kategoriGoldeb, " +
                     "kec.nm_kec as namaKecamatan, kel.nm_kelurahan as namaKelurahan, kdp.kodepos, " +
                     "kk.nm_kota_kab as namaKotaKab, prop.nm_propinsi as namaPropinsi from m_cust_perorangan_umum cp " +
                     "join m_gol_deb gd on cp.id_gol_deb = gd.gol_deb_id " + 
                     "join m_kecamatan kec on cp.id_kecamatan_domisili = kec.id_kecamatan and cp.id_kecamatan_identitas = kec.id_kecamatan " +
                     "join m_kelurahan kel on cp.id_kelurahan_domisili = kel.id_kelurahan and cp.id_kelurahan_identitas = kel.id_kelurahan " +
                     "join m_kode_pos kdp on cp.id_kode_pos_domisili = kdp.id and cp.id_kode_pos_identitas  = kdp.id " +
                     "join m_kota_kab kk on cp.id_kota_kabupaten_domisili = kk.id_kota_kab and cp.id_kota_kabupaten_identitas = kk.id_kota_kab " +
                     "join m_propinsi prop on cp.id_propinsi_domisili = prop.id_propinsi and cp.id_propinsi_identitas = prop.id_propinsi";
        List<CustPerorangan> brg = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(CustPerorangan.class));
        return brg;
    }

    public List<CustPerorangan> getListCust(DataTablesRequest req){
        String SQL ="select cp.id_nasabah_perorangan as idNasabahPerorangan, cp.id_entry as idEntry, cp.id_update as idUpdate, " +
                    "cp.d_entry as dEntry, cp.d_update as dUpdate, cp.alamat_domisili as alamatDomisili, " +
                    "cp.alamat_email as alamatEmail, cp.alamat_identitas as alamatIdentitas, cp.gelar_belakang as gelarBelakang, " +
                    "cp.gelar_depan as gelarDepan, cp.is_blacklist as isBlacklist, cp.keterangan_diblacklist as ketDiblacklist, " +
                    "cp.nama_identitas as namaIdentitas, cp.nama_nasabah as namaNasabah, cp.no_identitas as noIdentitas, " +
                    "cp.no_mobile as noMobile, cp.no_npwp as noNpwp, cp.no_telp as noTelp, cp.nomor_register_nasabah as noRegNasabah, " +
                    "cp.status_seumur_hidup_identitas as statSeumurHidupId, cp.tipe_identitas as tipeIdentitas, cp.id_bpr as idBpr, " +
                    "cp.id_gol_deb as idGolDeb, cp.id_kecamatan_domisili as idKecDomisili, cp.id_kecamatan_identitas as idKecIdentitas, " +
                    "cp.id_kelurahan_domisili as idKelDomisili, cp.id_kelurahan_identitas as idKelIdentitas, " + 
                    "cp.id_kode_pos_domisili as idKodePosDomisili, cp.id_kode_pos_identitas as idKodePosIdentitas, " +
                    "cp.id_kota_kabupaten_domisili as idKotaKabDomisili, cp.id_kota_kabupaten_identitas as idKotaKabIdentitas, " +
                    "cp.id_propinsi_domisili as idPropDomisili, cp.id_propinsi_identitas as idPropIdentitas, " +
                    "cp.domisili_sesuai_identitas as domisiliSesuaiIdentitas, cp.bpr_cabang as bprCabang, "+
                    "cp.saldo_tabungan_deposito as saldoTabunganDeposito, " +
                    "gd.gol_deb_ket as golDebKet, gd.kode_goldeb as kodeGoldeb, gd.kategori_goldeb as kategoriGoldeb, " +
                    "kec.nm_kec as namaKecamatan, kel.nm_kelurahan as namaKelurahan, kdp.kodepos, " +
                    "kk.nm_kota_kab as namaKotaKab, prop.nm_propinsi as namaPropinsi from m_cust_perorangan_umum cp " +
                    "join m_gol_deb gd on cp.id_gol_deb = gd.gol_deb_id " + 
                    "join m_kecamatan kec on cp.id_kecamatan_domisili = kec.id_kecamatan and cp.id_kecamatan_identitas = kec.id_kecamatan " +
                    "join m_kelurahan kel on cp.id_kelurahan_domisili = kel.id_kelurahan and cp.id_kelurahan_identitas = kel.id_kelurahan " +
                    "join m_kode_pos kdp on cp.id_kode_pos_domisili = kdp.id and cp.id_kode_pos_identitas  = kdp.id " +
                    "join m_kota_kab kk on cp.id_kota_kabupaten_domisili = kk.id_kota_kab and cp.id_kota_kabupaten_identitas = kk.id_kota_kab " +
                    "join m_propinsi prop on cp.id_propinsi_domisili = prop.id_propinsi and cp.id_propinsi_identitas = prop.id_propinsi " +
                    "order by " +(req.getSortCol()+1)+ "  " +req.getSortDir()  +" limit ? offset ? ";
        if(!req.getExtraParam().isEmpty()){
            String idNasabahPerorangan = (String) req.getExtraParam().get("idNasabahPerorangan");
            SQL =   "select cp.id_nasabah_perorangan as idNasabahPerorangan, cp.id_entry as idEntry, cp.id_update as idUpdate, " +
                    "cp.d_entry as dEntry, cp.d_update as dUpdate, cp.alamat_domisili as alamatDomisili, " +
                    "cp.alamat_email as alamatEmail, cp.alamat_identitas as alamatIdentitas, cp.gelar_belakang as gelarBelakang, " +
                    "cp.gelar_depan as gelarDepan, cp.is_blacklist as isBlacklist, cp.keterangan_diblacklist as ketDiblacklist, " +
                    "cp.nama_identitas as namaIdentitas, cp.nama_nasabah as namaNasabah, cp.no_identitas as noIdentitas, " +
                    "cp.no_mobile as noMobile, cp.no_npwp as noNpwp, cp.no_telp as noTelp, cp.nomor_register_nasabah as noRegNasabah, " +
                    "cp.status_seumur_hidup_identitas as statSeumurHidupId, cp.tipe_identitas as tipeIdentitas, cp.id_bpr as idBpr, " +
                    "cp.id_gol_deb as idGolDeb, cp.id_kecamatan_domisili as idKecDomisili, cp.id_kecamatan_identitas as idKecIdentitas, " +
                    "cp.id_kelurahan_domisili as idKelDomisili, cp.id_kelurahan_identitas as idKelIdentitas, " + 
                    "cp.id_kode_pos_domisili as idKodePosDomisili, cp.id_kode_pos_identitas as idKodePosIdentitas, " +
                    "cp.id_kota_kabupaten_domisili as idKotaKabDomisili, cp.id_kota_kabupaten_identitas as idKotaKabIdentitas, " +
                    "cp.id_propinsi_domisili as idPropDomisili, cp.id_propinsi_identitas as idPropIdentitas, " +
                    "cp.domisili_sesuai_identitas as domisiliSesuaiIdentitas, cp.bpr_cabang as bprCabang, "+
                    "cp.saldo_tabungan_deposito as saldoTabunganDeposito, " +
                    "gd.gol_deb_ket as golDebKet, gd.kode_goldeb as kodeGoldeb, gd.kategori_goldeb as kategoriGoldeb, " +
                    "kec.nm_kec as namaKecamatan, kel.nm_kelurahan as namaKelurahan, kdp.kodepos, " +
                    "kk.nm_kota_kab as namaKotaKab, prop.nm_propinsi as namaPropinsi from m_cust_perorangan_umum cp " +
                    "join m_gol_deb gd on cp.id_gol_deb = gd.gol_deb_id " + 
                    "join m_kecamatan kec on cp.id_kecamatan_domisili = kec.id_kecamatan and cp.id_kecamatan_identitas = kec.id_kecamatan " +
                    "join m_kelurahan kel on cp.id_kelurahan_domisili = kel.id_kelurahan and cp.id_kelurahan_identitas = kel.id_kelurahan " +
                    "join m_kode_pos kdp on cp.id_kode_pos_domisili = kdp.id and cp.id_kode_pos_identitas  = kdp.id " +
                    "join m_kota_kab kk on cp.id_kota_kabupaten_domisili = kk.id_kota_kab and cp.id_kota_kabupaten_identitas = kk.id_kota_kab " +
                    "join m_propinsi prop on cp.id_propinsi_domisili = prop.id_propinsi and cp.id_propinsi_identitas = prop.id_propinsi " +
                    "WHERE id_nasabah_perorangan like concat('%',?,'%') " +
                    "order by " +(req.getSortCol()+1)+ "  " +req.getSortDir()  +" limit ? offset ? ";
            return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(CustPerorangan.class), idNasabahPerorangan, req.getLength(), req.getStart());
        }else{
            return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(CustPerorangan.class), req.getLength(), req.getStart());
        }

    }

    public Integer getBanyakCustPerorangan(DataTablesRequest req){
        String query = "SELECT count(id_nasabah_perorangan) as banyak FROM m_cust_perorangan_umum";
        if(!req.getExtraParam().isEmpty()){
            String nama_genre = (String) req.getExtraParam().get("namaGenre");
            query = " SELECT count(id_nasabah_perorangan) as banyak FROM m_cust_perorangan_umum WHERE  id_nasabah_perorangan like concat('%',?,'%')";
            return jdbcTemplate.queryForObject(query, Integer.class, nama_genre);
        }else{
            return this.jdbcTemplate.queryForObject(query, null, Integer.class);
        }

    }
    
}
