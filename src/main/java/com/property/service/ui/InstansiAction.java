package com.property.service.ui;

import java.util.List;

import com.property.service.impl.InstansiJdbc;
import com.property.service.model.Instansi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstansiAction {

    @Autowired
    private InstansiJdbc instansiJdbc;

    @GetMapping(path= "/api/listinstansijson")
    public ResponseEntity<List<Instansi>> listBarangJson(){
        return ResponseEntity.ok().body(instansiJdbc.getInstansi());
    }
    
}
