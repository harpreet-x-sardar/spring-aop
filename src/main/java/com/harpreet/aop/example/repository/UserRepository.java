package com.harpreet.aop.example.repository;

import com.harpreet.aop.example.entity.User;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {


    private List<User> userList =
            Arrays.asList(new User(1L, "FN", "MN", "LN"),
                    new User(1L, "FN", "MN", "LN"));

    public List<User> getAllUsers(){
        System.out.println("insode user repo dao");
        return userList;
    }

}
