package com.harpreet.aop.example.controller;

import com.harpreet.aop.example.aspects.LogExecutionTime;
import com.harpreet.aop.example.entity.User;
import com.harpreet.aop.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/status")
    public Boolean healthCheck(){
        System.out.println("inside the controller status call.....");
        return true;
    }

    @GetMapping("/get-user-list")
    @LogExecutionTime
    public List<User> getUserList(){
        System.out.println("inside the controller get-user-list call.....");
        return userService.getUserList() ;
    }
}
