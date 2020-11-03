package com.property.service.ui;

import java.util.List;

import com.property.service.impl.PekerjaanJdbc;
import com.property.service.model.Pekerjaan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PekerjaanAction {

    @Autowired
    private PekerjaanJdbc pekerjaanJdbc;

    @GetMapping(path= "/api/listpekerjaanjson")
    public ResponseEntity<List<Pekerjaan>> listPekerjaanJson(){
        return ResponseEntity.ok().body(pekerjaanJdbc.getPekerjaan());
    }
    
}
