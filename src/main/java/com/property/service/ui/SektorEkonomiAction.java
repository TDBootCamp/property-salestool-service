package com.property.service.ui;

import java.util.List;

import com.property.service.impl.SektorEkonomiJdbc;
import com.property.service.model.SektorEkonomi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SektorEkonomiAction {

    @Autowired
    private SektorEkonomiJdbc sektorEkonomiJdbc;

    @GetMapping(path= "/api/listsektorekonomijson")
    public ResponseEntity<List<SektorEkonomi>> listSektorEkonomiJson(){
        return ResponseEntity.ok().body(sektorEkonomiJdbc.getSektorEkonomi());
    }
    
}
