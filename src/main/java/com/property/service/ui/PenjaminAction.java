package com.property.service.ui;

import java.util.List;

import com.property.service.impl.PenjaminJdbc;
import com.property.service.model.Penjamin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PenjaminAction {

    @Autowired
    private PenjaminJdbc penjaminJdbc;

    @GetMapping(path= "/api/listpenjaminjson")
    public ResponseEntity<List<Penjamin>> listPenjaminJson(){
        return ResponseEntity.ok().body(penjaminJdbc.getPenjamin());
    }
    
}
