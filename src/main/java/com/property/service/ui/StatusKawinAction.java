package com.property.service.ui;

import java.util.List;

import com.property.service.impl.StatusKawinJdbc;
import com.property.service.model.StatusKawin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusKawinAction {

    @Autowired
    private StatusKawinJdbc statusKawinJdbc;

    @GetMapping(path= "/api/liststatuskawinjson")
    public ResponseEntity<List<StatusKawin>> listStatusKawinJson(){
        return ResponseEntity.ok().body(statusKawinJdbc.getStatusKawin());
    }
    
}
