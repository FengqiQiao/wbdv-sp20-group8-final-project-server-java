package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.models.Answer;
import com.example.wbdvsp20group8finalprojectserverjava.models.Question;
import com.example.wbdvsp20group8finalprojectserverjava.models.University;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.AnswerRepository;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionRepository questionRepository;

    public List<Answer> findAllAnswers(){
        return (List<Answer>) answerRepository.findAll();
    }

    public List<Answer> findAnswersForQuestion(Integer qid){
        return answerRepository.findAnswersForQuestion(qid);
    }

    public Answer createAnswer(Integer qid, Answer answer){
        Question question = questionRepository.findById(qid).get();
        answer.setQuestion(question);
        return answerRepository.save(answer);
    }

    public int deleteAnswer(Integer aid){
        answerRepository.deleteById(aid);
        return 1;
    }
}
