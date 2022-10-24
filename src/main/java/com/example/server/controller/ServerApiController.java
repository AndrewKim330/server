package com.example.server.controller;

import com.example.server.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/hello")
    public User hello(){
        User user = new User();
        user.setName("andrew");
        user.setAge(35);
        return user;
    }



}
