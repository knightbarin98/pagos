package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.Concept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConceptDao extends CrudRepository<Concept,Long> {
}
