package com.property.service.ui;

import java.util.List;

import com.property.service.impl.GolDebJdbc;
import com.property.service.model.GolDeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GolDebAction {

    @Autowired
    private GolDebJdbc golDebJdbc;

    @GetMapping(path= "/api/listgoldebjson")
    public ResponseEntity<List<GolDeb>> listGolDebJson(){
        return ResponseEntity.ok().body(golDebJdbc.getGolDeb());
    }
    
}
