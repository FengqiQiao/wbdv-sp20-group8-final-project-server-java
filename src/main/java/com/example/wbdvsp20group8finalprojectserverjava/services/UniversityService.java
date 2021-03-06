package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.models.University;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.UniversityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// this is to checkout branches
// test
@Service
public class UniversityService {

  @Autowired
  UniversityRepository universityRepository;

  public int isValidName(String name) {
    List<String> valid = universityRepository.findAllValid(name);
    if (valid.size() == 1) {
      return (1);
    }
    else{
      return (0);
    }
  }

  public University findUniversityByName(String universityName){
    return universityRepository.findUniversityByName(universityName);
  }
}
