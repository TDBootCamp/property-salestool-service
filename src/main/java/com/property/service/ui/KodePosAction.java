package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KodePosJdbc;
import com.property.service.model.KodePos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KodePosAction {

    @Autowired
    private KodePosJdbc kodePosJdbc;

    @GetMapping(path= "/api/listkodeposjson")
    public ResponseEntity<List<KodePos>> listKodePosJson(){
        return ResponseEntity.ok().body(kodePosJdbc.getKodePos());
    }
    
}
