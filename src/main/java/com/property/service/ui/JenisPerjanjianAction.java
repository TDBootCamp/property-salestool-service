package com.property.service.ui;

import java.util.List;

import com.property.service.impl.JenisPerjanjianJdbc;
import com.property.service.model.JenisPerjanjian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenisPerjanjianAction {

    @Autowired
    private JenisPerjanjianJdbc jenisPerjanjianJdbc;

    @GetMapping(path= "/api/listjenisperjanjianjson")
    public ResponseEntity<List<JenisPerjanjian>> listJenisPerjanjianJson(){
        return ResponseEntity.ok().body(jenisPerjanjianJdbc.getJenisPerjanjian());
    }
    
}
