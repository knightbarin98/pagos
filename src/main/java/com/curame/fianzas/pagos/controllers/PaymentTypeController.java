package com.curame.fianzas.pagos.controllers;

import com.curame.fianzas.pagos.models.entity.PaymentType;
import com.curame.fianzas.pagos.services.IPaymentTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class PaymentTypeController {

    @Autowired
    private IPaymentTypeService service;

    @GetMapping("/payment-types")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<PaymentType> getPaymentTypes(){
        log.info("request GET: {}",this);
        return service.getPaymentTypes();
    }
}
