package com.property.service.ui;

import java.util.List;

import com.property.service.impl.BentukBadanUsahaJdbc;
import com.property.service.model.BentukBadanUsaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BentukBadanUsahaAction {

    @Autowired
    private BentukBadanUsahaJdbc bentukBadanUsahaJdbc;

    @GetMapping(path= "/api/listbentukbadanusahajson")
    public ResponseEntity<List<BentukBadanUsaha>> listBentukBadanUsahaJson(){
        return ResponseEntity.ok().body(bentukBadanUsahaJdbc.getBentukBadanUsaha());
    }
    
}
