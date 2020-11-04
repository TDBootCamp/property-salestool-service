package com.property.service.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.property.service.impl.KaryawanJdbc;
import com.property.service.model.Karyawan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class KaryawanAction {

    @Autowired
    private KaryawanJdbc karyawanJdbc;

    @GetMapping(path= "/api/listkaryawanjson")
    public ResponseEntity<List<Karyawan>> listJabatanJson(){
        return ResponseEntity.ok().body(karyawanJdbc.getKaryawan());
    }

    @PostMapping("/api/savekaryawanjson")
    public ResponseEntity <Map<String,Object>> savegenrejson(@RequestBody Karyawan karyawan){
        Map<String, Object> status = new HashMap<>();
        karyawanJdbc.insertKaryawan(karyawan);
        status.put("pesan", "Simpan Berhasil");
        return ResponseEntity.ok().body(status);
    }
    
}
