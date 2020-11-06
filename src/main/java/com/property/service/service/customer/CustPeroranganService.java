package com.property.service.service.customer;

import com.property.service.impl.customer.CustPeroranganJdbc;
import com.property.service.model.customer.CustPerorangan;
import com.property.service.model.dataTables.DataTablesRequest;
import com.property.service.model.dataTables.DataTablesResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustPeroranganService {

    @Autowired
    private CustPeroranganJdbc custPeroranganJdbc;

    public DataTablesResponse<CustPerorangan> listCustPeroranganDataTable (DataTablesRequest req) {
        DataTablesResponse dataTableRespon = new DataTablesResponse();
        dataTableRespon.setData(custPeroranganJdbc.getListCust(req));
        Integer total = custPeroranganJdbc.getBanyakCustPerorangan(req);
        dataTableRespon.setRecordsFiltered(total);
        dataTableRespon.setRecordsTotal(total);
        dataTableRespon.setDraw(req.getDraw());
        return dataTableRespon;
    }
    
}
