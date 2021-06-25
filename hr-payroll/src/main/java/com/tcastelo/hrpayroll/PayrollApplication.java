package com.tcastelo.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
public class PayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApplication.class,args);
    }
}
