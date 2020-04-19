package com.example.wbdvsp20group8finalprojectserverjava.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String questionTitle;
    private String questionContent;
    private String time;

    public Question() {
    }

    @ManyToOne
    private User user;

    @ManyToOne
    private University university;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestion() {
        return questionContent;
    }

    public void setQuestion(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}
