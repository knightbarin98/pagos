package com.curame.fianzas.pagos.controllers;

import com.curame.fianzas.pagos.models.entity.Concept;
import com.curame.fianzas.pagos.services.IConceptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ConceptController {

    @Autowired
    private IConceptService service;

    @GetMapping("/concepts")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Concept> getConcepts(){
        log.info("request GET: {}",this);
        return service.getConcepts();
    }
}
