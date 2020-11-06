package com.property.service.ui;

import java.util.List;

import com.property.service.impl.IdentitasJdbc;
import com.property.service.model.Identitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdentitasAction {

    @Autowired
    private IdentitasJdbc identitasJdbc;

    @GetMapping(path= "/api/listidentitasjson")
    public ResponseEntity<List<Identitas>> listIdentitasJson(){
        return ResponseEntity.ok().body(identitasJdbc.getIdentitas());
    }
    
}
