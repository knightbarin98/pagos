package com.curame.fianzas.pagos.services;

import com.curame.fianzas.pagos.models.entity.PaymentType;
import com.curame.fianzas.pagos.repository.PaymentTypeDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PaymentTypeServiceImpl implements IPaymentTypeService{
    @Autowired
    private PaymentTypeDao repository;

    @Override
    public List<PaymentType> getPaymentTypes() {
        log.info("obtener objetos: {}", this);
        List<PaymentType> paymentTypes = new ArrayList<>();
        repository.findAll().forEach(paymentType -> paymentTypes.add(paymentType));
        return paymentTypes;
    }
}
