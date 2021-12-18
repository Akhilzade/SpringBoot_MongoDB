package com.user.controller;

import com.user.entity.User;
import com.user.services.UserServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    UserController userController;

    @Mock
    UserServices userServices;

    User user;

    @BeforeEach
    void setUp() {
        user =new User();
        user.setId(1);
        user.setName("AkhilZade");
        user.setAge(23);
        user.setSalary(1213144);

    }

    @Test
    void saveUser() {
        userServices.save(user);
    }
}