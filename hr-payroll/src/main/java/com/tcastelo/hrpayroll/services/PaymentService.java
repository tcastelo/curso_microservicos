package com.tcastelo.hrpayroll.services;

import com.tcastelo.hrpayroll.entity.Payment;
import com.tcastelo.hrpayroll.entity.Worker;
import com.tcastelo.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId,int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(1L,worker.getName(),worker.getDailyIncome(),10);
    }
}
