package com.property.service.ui;

import java.util.List;

import com.property.service.impl.DaftarSumberDanaJdbc;
import com.property.service.model.DaftarSumberDana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DaftarSumberDanaAction {

    @Autowired
    private DaftarSumberDanaJdbc daftarSumberDanaJdbc;

    @GetMapping(path= "/api/listdaftarsumberdanajson")
    public ResponseEntity<List<DaftarSumberDana>> listDaftarSumberDanaJson(){
        return ResponseEntity.ok().body(daftarSumberDanaJdbc.getDaftarSumberDana());
    }
    
}
