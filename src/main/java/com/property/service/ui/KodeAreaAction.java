package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KodeAreaJdbc;
import com.property.service.model.KodeArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KodeAreaAction {

    @Autowired
    private KodeAreaJdbc kodeAreaJdbc;

    @GetMapping(path= "/api/listkodeareajson")
    public ResponseEntity<List<KodeArea>> listKodeAreaJson(){
        return ResponseEntity.ok().body(kodeAreaJdbc.getKodeArea());
    }
    
}
