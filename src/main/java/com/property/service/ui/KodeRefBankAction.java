package com.property.service.ui;

import java.util.List;

import com.property.service.impl.KodeRefBankJdbc;
import com.property.service.model.KodeRefBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KodeRefBankAction {

    @Autowired
    private KodeRefBankJdbc kodeRefBankJdbc;

    @GetMapping(path= "/api/listkoderefbankjson")
    public ResponseEntity<List<KodeRefBank>> listKodeRefBankJson(){
        return ResponseEntity.ok().body(kodeRefBankJdbc.getKodeRefBank());
    }
    
}
