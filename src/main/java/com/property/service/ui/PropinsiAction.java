package com.property.service.ui;

import java.util.List;

import com.property.service.impl.PropinsiJdbc;
import com.property.service.model.Propinsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PropinsiAction {

    @Autowired
    private PropinsiJdbc propinsiJdbc;

    @GetMapping(path= "/api/listpropinsijson")
    public ResponseEntity<List<Propinsi>> listPropinsiJson(){
        return ResponseEntity.ok().body(propinsiJdbc.getPropinsi());
    }
    
}
