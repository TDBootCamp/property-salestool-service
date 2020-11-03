package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KecamatanJdbc;
import com.property.service.model.Kecamatan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KecamatanAction {
    
    @Autowired
    private KecamatanJdbc kecamatanJdbc;

    @GetMapping(path= "/api/listkecamatanjson")
    public ResponseEntity<List<Kecamatan>> listKotaKabJson(){
        return ResponseEntity.ok().body(kecamatanJdbc.getKecamatan());
    }

}
