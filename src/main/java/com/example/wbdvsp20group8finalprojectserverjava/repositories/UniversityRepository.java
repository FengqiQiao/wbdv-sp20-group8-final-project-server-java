package com.example.wbdvsp20group8finalprojectserverjava.repositories;

import com.example.wbdvsp20group8finalprojectserverjava.models.University;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UniversityRepository extends CrudRepository<University, Integer> {
  @Query(value = "SELECT university.name FROM University university WHERE university.name=:uname", nativeQuery = true)
  public List<String> findAllValid(@Param("uname") String universityName);

  @Query(value = "SELECT * FROM university WHERE university.name=:uname", nativeQuery = true)
  public University findUniversityByName(@Param("uname") String universityName);

}

//SELECT * FROM heroku_1e6d1c75808057e.university WHERE university.name="NEU";
