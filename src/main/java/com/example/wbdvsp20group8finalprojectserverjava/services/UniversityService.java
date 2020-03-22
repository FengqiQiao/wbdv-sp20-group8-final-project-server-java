package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.repositories.UniversityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

  @Autowired
  UniversityRepository universityRepository;
}
