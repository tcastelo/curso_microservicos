package com.tcastelo.hrpayroll.controller;

import com.tcastelo.hrpayroll.entity.Payment;
import com.tcastelo.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping("{workerId}/days/{days}")
    public ResponseEntity<Payment> findAll(@PathVariable Long workerId, @PathVariable int days){
        return ResponseEntity.ok(service.getPayment(workerId,days));
    }

}
