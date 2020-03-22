package com.example.wbdvsp20group8finalprojectserverjava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String description;
  private int tuitionFee;
  private String alumni;
  private String major;
  private int ranking;
  private String name;
  private String location;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getTuitionFee() {
    return tuitionFee;
  }

  public void setTuitionFee(int tuitionFee) {
    this.tuitionFee = tuitionFee;
  }

  public String getAlumni() {
    return alumni;
  }

  public void setAlumni(String alumni) {
    this.alumni = alumni;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public University() {
  }


}
