package com.lighthouse.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JWTUserDetailsService implements UserDetailsService {

    @Value("${admin.user}")
    private String adminUser;

    @Value("${admin.secret}")
    private String adminSecret;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if (adminUser.equals(userName)) {
            return new User(adminUser, adminSecret, new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Username: " + userName + " not found");
        }
    }
}
