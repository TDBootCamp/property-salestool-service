package com.property.service.ui.Customer;

import java.util.List;

import com.property.service.impl.customer.CustPeroranganJdbc;
import com.property.service.model.customer.CustPerorangan;
import com.property.service.model.dataTables.DataTablesRequest;
import com.property.service.model.dataTables.DataTablesResponse;
import com.property.service.service.customer.CustPeroranganService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CustPeroranganAction {

    @Autowired
    private CustPeroranganService custPeroranganService;
    
    @Autowired
    private CustPeroranganJdbc custPeroranganJdbc;

    @GetMapping(path= "/api/listcustperoranganjson")
    public ResponseEntity<List<CustPerorangan>> listAgamaJson(){
        return ResponseEntity.ok().body(custPeroranganJdbc.getCustPerorangan());
    }
    
    @PostMapping(path="/api/listcustperorangandtjson")
    public ResponseEntity<DataTablesResponse<CustPerorangan>> listCustPeroranganDataTable(@RequestBody DataTablesRequest dataRequest){
        return ResponseEntity.ok().body(custPeroranganService.listCustPeroranganDataTable(dataRequest));
    }
}
