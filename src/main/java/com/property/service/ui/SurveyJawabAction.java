package com.property.service.ui;

import java.util.List;

import com.property.service.impl.SurveyJawabJdbc;
import com.property.service.model.SurveyJawab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyJawabAction {

    @Autowired
    private SurveyJawabJdbc surveyJawabJdbc;

    @GetMapping(path= "/api/listsurveyjawabjson")
    public ResponseEntity<List<SurveyJawab>> listSurveyJawabJson(){
        return ResponseEntity.ok().body(surveyJawabJdbc.getSurveyJawab());
    }
    
}
