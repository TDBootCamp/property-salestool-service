package com.property.service.ui;

import java.util.List;

import com.property.service.impl.SumberDanaJdbc;
import com.property.service.model.SumberDana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SumberDanaAction {

    @Autowired
    private SumberDanaJdbc sumberDanaJdbc;

    @GetMapping(path= "/api/listsumberdanajson")
    public ResponseEntity<List<SumberDana>> listSumberDanaJson(){
        return ResponseEntity.ok().body(sumberDanaJdbc.getSumberDana());
    }
    
}
