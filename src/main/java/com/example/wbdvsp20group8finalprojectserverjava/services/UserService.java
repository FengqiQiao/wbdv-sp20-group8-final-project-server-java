package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.wbdvsp20group8finalprojectserverjava.models.User;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public boolean isValidUserame(String username) {
        User exist = userRepository.findUserByUsername(username);
        if (exist != null) {
            return false;
        }
        else{
            return true;
        }
    }
}
