package com.curame.fianzas.pagos.services;

import com.curame.fianzas.pagos.models.entity.Payment;

import java.util.List;

public interface IPaymentService {

    public List<Payment> getPayments();
    public Payment getPayment(Long id);
    public Payment create (Payment payment);
    public Payment update (Payment payment, Long id);
    public void delete(Long id);
}
