package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao extends CrudRepository<Payment,Long> {
}
