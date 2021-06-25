package com.tcastelo.hrpayroll.feignclients;

import com.tcastelo.hrpayroll.entity.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/api/workers")
public interface WorkerFeignClient {

    @GetMapping("{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
