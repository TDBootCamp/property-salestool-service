package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KategoriJaminanJdbc;
import com.property.service.model.KategoriJaminan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KategoriJaminanAction {

    @Autowired
    private KategoriJaminanJdbc kategoriJaminanJdbc;

    @GetMapping(path= "/api/listkategorijaminanjson")
    public ResponseEntity<List<KategoriJaminan>> listKategoriJaminanJson(){
        return ResponseEntity.ok().body(kategoriJaminanJdbc.getKategoriJaminan());
    }
    
}
