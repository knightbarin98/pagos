package com.curame.fianzas.pagos.services;

import com.curame.fianzas.pagos.models.entity.Concept;
import com.curame.fianzas.pagos.repository.ConceptDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ConceptServieImpl implements IConceptService{

    @Autowired
    private ConceptDao repository;

    @Override
    public List<Concept> getConcepts() {
        log.info("obtener objetos: {}", this);
        List<Concept> concepts = new ArrayList<>();
        repository.findAll().forEach(concept -> concepts.add(concept));
        return concepts;
    }
}
