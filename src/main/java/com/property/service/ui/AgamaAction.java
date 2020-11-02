package com.property.service.ui;

import java.util.List;

import com.property.service.impl.AgamaJdbc;
import com.property.service.model.Agama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgamaAction {

    @Autowired
    private AgamaJdbc agamaJdbc;

    @GetMapping(path= "/api/listagamajson")
    public ResponseEntity<List<Agama>> listAgamaJson(){
        return ResponseEntity.ok().body(agamaJdbc.getAgama());
    }
    
}
