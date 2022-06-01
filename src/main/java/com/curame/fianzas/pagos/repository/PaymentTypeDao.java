package com.curame.fianzas.pagos.repository;

import com.curame.fianzas.pagos.models.entity.PaymentType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeDao extends CrudRepository<PaymentType,Long> {
}
