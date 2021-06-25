package com.tcastelo.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
@RibbonClient(name = "hr-worker")
public class PayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApplication.class,args);
    }
}
