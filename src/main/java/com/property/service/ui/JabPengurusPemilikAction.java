package com.property.service.ui;

import java.util.List;

import com.property.service.impl.JabPengurusPemilikJdbc;
import com.property.service.model.JabPengurusPemilik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JabPengurusPemilikAction {

    @Autowired
    private JabPengurusPemilikJdbc jabPengurusPemilikJdbc;

    @GetMapping(path= "/api/listjabpenguruspemilikjson")
    public ResponseEntity<List<JabPengurusPemilik>> listJabPengurusPemilikJson(){
        return ResponseEntity.ok().body(jabPengurusPemilikJdbc.getJabPengurusPemilik());
    }
    
}
