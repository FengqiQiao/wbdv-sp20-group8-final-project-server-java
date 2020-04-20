package com.example.wbdvsp20group8finalprojectserverjava.controllers;

import com.example.wbdvsp20group8finalprojectserverjava.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.wbdvsp20group8finalprojectserverjava.models.University;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class UniversityController {

    @Autowired
    UniversityService service;

    @GetMapping("/api/checkvalid/{uname}")
    public int isValidName(
            @PathVariable("uname") String uname) {
        return service.isValidName(uname);
    }

    @GetMapping("/api/universities/{uname}")
    public University findUniversityByName(
            @PathVariable("uname") String uname) {
                return service.findUniversityByName(uname);
    }
}
