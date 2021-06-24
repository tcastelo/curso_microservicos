package com.tcastelo.hrpayroll.services;

import com.tcastelo.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId,int days){
        return new Payment(1L,"Thiago",200.0,10);
    }
}
