package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KelurahanJdbc;
import com.property.service.model.Kelurahan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KelurahanAction {

    @Autowired
    private KelurahanJdbc kelurahanJdbc;

    @GetMapping(path= "/api/listkelurahanjson")
    public ResponseEntity<List<Kelurahan>> listKelurahanJson(){
        return ResponseEntity.ok().body(kelurahanJdbc.getKelurahan());
    }
    
}
