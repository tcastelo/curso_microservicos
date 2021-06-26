package com.tcastelo.hrworker.controller;

import com.tcastelo.hrworker.entity.Worker;
import com.tcastelo.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
@RefreshScope
public class WorkerController {

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @Value("${test.config}")
    private String testConfig;

    @GetMapping("/config")
    public ResponseEntity<String> getConfig(){
        return ResponseEntity.ok(testConfig);
    }
}
