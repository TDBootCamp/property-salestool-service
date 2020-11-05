package com.property.service.ui;

import java.util.List;

import com.property.service.impl.HubDenganPelaporJdbc;
import com.property.service.model.HubDenganPelapor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubDenganPelaporAction {

    @Autowired
    private HubDenganPelaporJdbc hubDenganPelaporJdbc;

    @GetMapping(path= "/api/listhubdenganpelaporjson")
    public ResponseEntity<List<HubDenganPelapor>> listHubDenganPelaporJson(){
        return ResponseEntity.ok().body(hubDenganPelaporJdbc.getHubDenganPelapor());
    }
    
}
