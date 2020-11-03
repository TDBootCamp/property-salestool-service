package com.property.service.ui;

import java.util.List;

import com.property.service.impl.JabatanJdbc;
import com.property.service.model.Jabatan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JabatanAction {

    @Autowired
    private JabatanJdbc jabatanJdbc;

    @GetMapping(path= "/api/listjabatanjson")
    public ResponseEntity<List<Jabatan>> listJabatanJson(){
        return ResponseEntity.ok().body(jabatanJdbc.getJabatan());
    }
    
}
