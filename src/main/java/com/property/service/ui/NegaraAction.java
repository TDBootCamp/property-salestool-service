package com.property.service.ui;

import java.util.List;

import com.property.service.impl.NegaraJdbc;
import com.property.service.model.Negara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NegaraAction {
    
    @Autowired
    private NegaraJdbc negaraJdbc;

    @GetMapping(path= "/api/listnegarajson")
    public ResponseEntity<List<Negara>> listNegaraJson(){
        return ResponseEntity.ok().body(negaraJdbc.getNegara());
    }

}
