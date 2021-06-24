package com.tcastelo.hrworker.repository;

import com.tcastelo.hrworker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
