package com.property.service.ui;

import java.util.List;

import com.property.service.impl.BarangJdbc;
import com.property.service.model.Barang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BarangAction {

    @Autowired
    private BarangJdbc barangJdbc;

    @GetMapping(path= "/api/listbarangjson")
    public ResponseEntity<List<Barang>> listBarangJson(){
        return ResponseEntity.ok().body(barangJdbc.getBarang());
    }
    
}
