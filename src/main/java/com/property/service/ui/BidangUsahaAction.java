package com.property.service.ui;

import java.util.List;

import com.property.service.impl.BidangUsahaJdbc;
import com.property.service.model.BidangUsaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BidangUsahaAction {

    @Autowired
    private BidangUsahaJdbc bidangUsahaJdbc;

    @GetMapping(path= "/api/listbidangusahajson")
    public ResponseEntity<List<BidangUsaha>> listBidangUsahaJson(){
        return ResponseEntity.ok().body(bidangUsahaJdbc.getBidangUsaha());
    }
    
}
