package com.property.service.ui;

import java.util.List;

import com.property.service.impl.SumberPenghasilanJdbc;
import com.property.service.model.SumberPenghasilan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SumberPenghasilanAction {

    @Autowired
    private SumberPenghasilanJdbc sumberPenghasilanJdbc;

    @GetMapping(path= "/api/listsumberpenghasilanjson")
    public ResponseEntity<List<SumberPenghasilan>> listSumberPenghasilanJson(){
        return ResponseEntity.ok().body(sumberPenghasilanJdbc.getSumberPenghasilan());
    }
    
}
