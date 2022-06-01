package com.curame.fianzas.pagos.controllers;

import com.curame.fianzas.pagos.models.entity.Payment;
import com.curame.fianzas.pagos.services.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    public IPaymentService service;

    @GetMapping("/payments")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Payment> getPayments(){
        log.info("request GET all: {}",this );
        return service.getPayments();
    }

    @GetMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Payment getPayment(@PathVariable Long id){
        log.info("request GET :"+id+" {}",this );
        return service.getPayment(id);
    }

    @PostMapping("/payments")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment create(@RequestBody Payment payment){
        log.info("request create : {}",this );
        return service.create(payment);
    }

    @PutMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment update(@RequestBody Payment payment, @PathVariable Long id){
        log.info("request update : {}",this );
        return service.update(payment,id);
    }

    @DeleteMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        log.info("request delete : {}",this );
        service.delete(id);
    }
}
