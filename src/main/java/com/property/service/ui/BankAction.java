package com.property.service.ui;

import java.util.List;

import com.property.service.impl.BankJdbc;
import com.property.service.model.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAction {

    @Autowired
    private BankJdbc bankJdbc;

    @GetMapping(path= "/api/listbankjson")
    public ResponseEntity<List<Bank>> listBankJson(){
        return ResponseEntity.ok().body(bankJdbc.getBank());
    }
    
}
