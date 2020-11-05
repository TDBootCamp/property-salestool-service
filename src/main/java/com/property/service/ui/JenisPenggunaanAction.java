package com.property.service.ui;

import java.util.List;

import com.property.service.impl.JenisPenggunaanJdbc;
import com.property.service.model.JenisPenggunaan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenisPenggunaanAction {

    @Autowired
    private JenisPenggunaanJdbc jenisPenggunaanJdbc;

    @GetMapping(path= "/api/listjenispenggunaanjson")
    public ResponseEntity<List<JenisPenggunaan>> listJenisPenggunaanJson(){
        return ResponseEntity.ok().body(jenisPenggunaanJdbc.getJenisPenggunaan());
    }
    
}
