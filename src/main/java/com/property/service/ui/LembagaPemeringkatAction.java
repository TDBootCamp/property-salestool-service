package com.property.service.ui;

import java.util.List;

import com.property.service.impl.LembagaPemeringkatJdbc;
import com.property.service.model.LembagaPemeringkat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LembagaPemeringkatAction {

    @Autowired
    private LembagaPemeringkatJdbc lembagaPemeringkatJdbc;

    @GetMapping(path= "/api/listlembagapemeringkatjson")
    public ResponseEntity<List<LembagaPemeringkat>> listLembagaPemeringkatJson(){
        return ResponseEntity.ok().body(lembagaPemeringkatJdbc.getLembagaPemeringkat());
    }
    
}
