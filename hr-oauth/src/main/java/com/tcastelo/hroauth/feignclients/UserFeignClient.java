package com.tcastelo.hroauth.feignclients;

import com.tcastelo.hroauth.entity.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path="/api/users")
public interface UserFeignClient {

    @GetMapping("/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);
    
}
