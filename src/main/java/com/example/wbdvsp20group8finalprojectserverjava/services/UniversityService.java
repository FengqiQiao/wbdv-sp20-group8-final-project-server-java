package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.repositories.UniversityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

  @Autowired
  UniversityRepository universityRepository;

  public Integer isValidName(String name) {
    List<String> valid = universityRepository.findAllValid(name);
    if (valid.size() == 1) {
      return (1);
    }
    else{
      return (0);
    }
  }
}
