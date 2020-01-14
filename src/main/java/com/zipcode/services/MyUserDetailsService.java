package com.zipcode.services;


import com.zipcode.models.Admin;
import com.zipcode.repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            Admin user = adminRepo.findByUsername(username);
            return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
        }catch(UsernameNotFoundException e){
            throw new UsernameNotFoundException("Username or password does not exist", e);
        }

    }
}