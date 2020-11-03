package com.property.service.ui;

import java.util.List;

import com.property.service.impl.PendidikanJdbc;
import com.property.service.model.Pendidikan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PendidikanAction {

    @Autowired
    private PendidikanJdbc pendidikanJdbc;

    @GetMapping(path= "/api/listpendidikanjson")
    public ResponseEntity<List<Pendidikan>> listPendidikanJson(){
        return ResponseEntity.ok().body(pendidikanJdbc.getPendidikan());
    }
    
}
