package com.example.wbdvsp20group8finalprojectserverjava.controllers;

import com.example.wbdvsp20group8finalprojectserverjava.models.Question;
import com.example.wbdvsp20group8finalprojectserverjava.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/api/questions")
    public List<Question> findAllQuestions(){
        return questionService.findAllQuestions();
    }

    @GetMapping("/api/universities/{uid}/questions")
    public List<Question> findQuestionsForUniversity(@PathVariable("uid") Integer uid){
        return questionService.findQuestionsForUniversity(uid);
    }

    @GetMapping("/api/users/{uid}/questions")
    public List<Question> findQuestionsForUser(@PathVariable("uid") Integer uid){
        return questionService.findQuestionsForUser(uid);
    }

    @PostMapping("/api/universities/{uid}/questions")
    public Question createQuestion(@PathVariable("uid") Integer uid, @RequestBody Question question) {
        return questionService.createQuestion(uid, question);
    }
}
