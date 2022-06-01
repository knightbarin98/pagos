package com.curame.fianzas.pagos.services;


import com.curame.fianzas.pagos.models.entity.Payment;
import com.curame.fianzas.pagos.repository.PaymentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PaymentServiceImpl implements IPaymentService{

    @Autowired
    private PaymentDao repository;

    @Override
    public List<Payment> getPayments() {
        log.info("obtener objetos: {}", this);
        List<Payment> payments = new ArrayList<>();
        repository.findAll().forEach(payment -> payments.add(payment));
        return payments;
    }

    @Override
    public Payment getPayment(Long id) {
        log.info("obtener objetos id:" + id + " {}", this);
        Payment payment = repository.findById(id).orElse(null);
        return payment;
    }

    @Override
    public Payment create(Payment payment) {
        log.info("create objeto {} , {}", payment, this);
        Payment newPayment = repository.save(payment);
        return newPayment;
    }

    @Override
    public Payment update(Payment payment, Long id) {
        Payment paymentdb = repository.findById(id).orElse(null);
        if (paymentdb == null) {
            return null;
        }

        paymentdb.setSubtotal(payment.getSubtotal());
        paymentdb.setTotal(payment.getTotal());
        paymentdb.setRfc(payment.getRfc());
        paymentdb.setVoice(payment.getVoice());

        return repository.save(paymentdb);
    }

    @Override
    public void delete(Long id) {
        log.info("delete objeto id: " + id + " {}", this);
        repository.deleteById(id);
    }

}
