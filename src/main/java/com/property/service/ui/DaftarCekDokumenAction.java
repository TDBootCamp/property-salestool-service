package com.property.service.ui;

import java.util.List;

import com.property.service.impl.DaftarCekDokumenJdbc;
import com.property.service.model.DaftarCekDokumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DaftarCekDokumenAction {

    @Autowired
    private DaftarCekDokumenJdbc daftarCekDokumenJdbc;

    @GetMapping(path= "/api/listdaftarcekdokumenjson")
    public ResponseEntity<List<DaftarCekDokumen>> listDaftarCekDokumenJson(){
        return ResponseEntity.ok().body(daftarCekDokumenJdbc.getDaftarCekDokumen());
    }
    
}
