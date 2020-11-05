package com.property.service.ui;

import java.util.List;

import com.property.service.impl.HubKeluargaJdbc;
import com.property.service.model.HubKeluarga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubKeluargaAction {

    @Autowired
    private HubKeluargaJdbc hubKeluargaJdbc;

    @GetMapping(path= "/api/listhubkeluargajson")
    public ResponseEntity<List<HubKeluarga>> listHubKeluargaJson(){
        return ResponseEntity.ok().body(hubKeluargaJdbc.getHubKeluarga());
    }
    
}
