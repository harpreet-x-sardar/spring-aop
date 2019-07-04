package com.harpreet.aop.example.service;

import com.harpreet.aop.example.entity.User;
import com.harpreet.aop.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList(){
        System.out.println("Inside user service.");
        return userRepository.getAllUsers();
    }
}
