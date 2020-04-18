package com.example.wbdvsp20group8finalprojectserverjava.controllers;

import com.example.wbdvsp20group8finalprojectserverjava.models.User;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.wbdvsp20group8finalprojectserverjava.services.UserService;

import javax.servlet.http.HttpSession;


//debug
@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class UserController {
    @Autowired
    UserRepository repository;

    @Autowired
    UserService service;

    @PostMapping("/login")
    public User login(HttpSession session, @RequestBody User user) {
        User profile = repository.findUserByCredentials(user.getUsername(), user.getPassword());
        profile.setPassword("***");
        session.setAttribute("profile", profile);
        return profile;
    }

    @PostMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @PostMapping("/register")
    public User register(HttpSession session, @RequestBody User user) {
        if(!service.isValidUserame(user.getUsername()))
            return null;
        User newUser = repository.save(user);
        newUser.setPassword("***");
        session.setAttribute("profile", newUser);
        return newUser;
    }

    @PostMapping("/profile")
    public User profile(HttpSession session) {
        User profile = (User)session.getAttribute("profile");
        profile.setPassword("***");
        return profile;
    }
}
