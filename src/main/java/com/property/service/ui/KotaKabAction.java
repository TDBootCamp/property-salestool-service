package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KotaKabJdbc;
import com.property.service.model.KotaKab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KotaKabAction {

    @Autowired
    private KotaKabJdbc kotaKabJdbc;

    @GetMapping(path= "/api/listkotakabjson")
    public ResponseEntity<List<KotaKab>> listKotaKabJson(){
        return ResponseEntity.ok().body(kotaKabJdbc.getKotaKab());
    }
    
}
