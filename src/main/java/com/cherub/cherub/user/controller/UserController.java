package com.cherub.cherub.user.controller;

import com.cherub.cherub.user.model.User;
import com.cherub.cherub.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository up;
    @GetMapping(value = "/userList")
    public List<User> userList(){
        return up.findAll();
    }
}
