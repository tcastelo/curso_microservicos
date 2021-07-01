package com.tcastelo.hroauth.service;

import com.tcastelo.hroauth.entity.User;
import com.tcastelo.hroauth.feignclients.UserFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userFeignClient.findByEmail(username).getBody();

        if(user == null) throw new UsernameNotFoundException("Email not found");

        return user;
    }
}
