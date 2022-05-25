package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.Payment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payments")
public interface PaymentDao extends PagingAndSortingRepository<Payment,Long> {
}
