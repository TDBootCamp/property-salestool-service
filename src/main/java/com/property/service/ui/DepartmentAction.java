package com.property.service.ui;

import java.util.List;

import com.property.service.impl.DepartmentJdbc;
import com.property.service.model.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentAction {

    @Autowired
    private DepartmentJdbc departmentJdbc;

    @GetMapping(path= "/api/listdepartmentjson")
    public ResponseEntity<List<Department>> listDepartmentJson(){
        return ResponseEntity.ok().body(departmentJdbc.getDepartment());
    }
    
}
