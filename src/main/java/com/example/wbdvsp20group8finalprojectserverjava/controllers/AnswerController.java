package com.example.wbdvsp20group8finalprojectserverjava.controllers;

import com.example.wbdvsp20group8finalprojectserverjava.models.Answer;
import com.example.wbdvsp20group8finalprojectserverjava.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping("/api/answers")
    public List<Answer> findAllAnswers(){
        return answerService.findAllAnswers();
    }

    @GetMapping("/api/questions/{qid}/answers")
    public List<Answer> findAnswersForQuestion(@PathVariable("qid") Integer qid){
        return answerService.findAnswersForQuestion(qid);
    }

    @PostMapping("/api/questions/{qid}/answers")
    public Answer createAnswers(@PathVariable("qid") Integer qid, @RequestBody Answer answer){
        return answerService.createAnswer(qid,answer);
    }

    @DeleteMapping("/api/answers/{aid}")
    public int deleteAnswer(@PathVariable("aid") Integer aid){
        return answerService.deleteAnswer(aid);
    }
}
