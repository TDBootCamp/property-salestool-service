package com.property.service.ui;

import java.util.List;

import com.property.service.impl.JaminanJdbc;
import com.property.service.model.Jaminan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JaminanAction {

    @Autowired
    private JaminanJdbc jaminanJdbc;

    @GetMapping(path= "/api/listjaminanjson")
    public ResponseEntity<List<Jaminan>> listJaminanJson(){
        return ResponseEntity.ok().body(jaminanJdbc.getJaminan());
    }
    
}
