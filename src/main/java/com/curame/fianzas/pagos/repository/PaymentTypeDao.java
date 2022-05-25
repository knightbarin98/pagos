package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.PaymentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment-types")
public interface PaymentTypeDao extends PagingAndSortingRepository<PaymentType,Long> {
}
