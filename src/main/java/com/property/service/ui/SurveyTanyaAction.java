package com.property.service.ui;

import java.util.List;

import com.property.service.impl.SurveyTanyaJdbc;
import com.property.service.model.SurveyTanya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyTanyaAction {

    @Autowired
    private SurveyTanyaJdbc surveyTanyaJdbc;

    @GetMapping(path= "/api/listsurveytanyajson")
    public ResponseEntity<List<SurveyTanya>> listSurveyTanyaJson(){
        return ResponseEntity.ok().body(surveyTanyaJdbc.getSurveyTanya());
    }
    
}
