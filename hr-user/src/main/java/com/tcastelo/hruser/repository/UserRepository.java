package com.tcastelo.hruser.repository;

import com.tcastelo.hruser.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmail(String email);
}
