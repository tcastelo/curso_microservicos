package com.tcastelo.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApplication.class,args);
    }
}
