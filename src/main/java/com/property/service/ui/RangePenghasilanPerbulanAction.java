package com.property.service.ui;

import java.util.List;

import com.property.service.impl.RangePenghasilanPerbulanJdbc;
import com.property.service.model.RangePenghasilanPerbulan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RangePenghasilanPerbulanAction {

    @Autowired
    private RangePenghasilanPerbulanJdbc rangePenghasilanPerbulanJdbc;

    @GetMapping(path= "/api/listrangeperbulanjson")
    public ResponseEntity<List<RangePenghasilanPerbulan>> listJaminanJson(){
        return ResponseEntity.ok().body(rangePenghasilanPerbulanJdbc.getRangePenghasilanPerbulan());
    }
    
}
