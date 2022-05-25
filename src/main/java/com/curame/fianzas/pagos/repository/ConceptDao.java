package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.Concept;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "concepts")
public interface ConceptDao extends PagingAndSortingRepository<Concept,Long> {
}
