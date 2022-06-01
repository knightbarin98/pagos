package com.curame.fianzas.pagos.services;

import com.curame.fianzas.pagos.models.entity.PaymentType;

import java.util.List;

public interface IPaymentTypeService {

    public List<PaymentType> getPaymentTypes();
}
