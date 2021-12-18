package com.user.services;

import com.user.entity.User;
import com.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    } 
    

}
