package com.user.controller;

import com.user.entity.User;
import com.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userServices.save(user);
    }

}
