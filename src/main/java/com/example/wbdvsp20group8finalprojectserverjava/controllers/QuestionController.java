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

    @GetMapping("/api/universities/{universityName}/questions")
    public List<Question> findQuestionsForUniversity(@PathVariable("universityName") String universityName){
        return questionService.findQuestionsForUniversity(universityName);
    }

    @GetMapping("/api/users/{uid}/questions")
    public List<Question> findQuestionsForUser(@PathVariable("uid") Integer uid){
        return questionService.findQuestionsForUser(uid);
    }

    @PostMapping("/api/universities/{universityName}/questions")
    public Question createQuestion(@PathVariable("universityName") String universityName, @RequestBody Question question) {
        return questionService.createQuestion(universityName, question);
    }

    @DeleteMapping("/api/questions/{qid}")
    public int deleteQuestion(@PathVariable("qid") Integer qid){
        return questionService.deleteQuestion(qid);
    }

    @GetMapping("api/questions/{qid}")
    public Question findQuestionById(@PathVariable("qid") Integer qid) {
        return questionService.findQuestionById(qid);
    }
}
