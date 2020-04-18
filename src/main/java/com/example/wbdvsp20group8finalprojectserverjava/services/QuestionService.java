package com.example.wbdvsp20group8finalprojectserverjava.services;

import com.example.wbdvsp20group8finalprojectserverjava.models.Question;
import com.example.wbdvsp20group8finalprojectserverjava.models.University;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.QuestionRepository;
import com.example.wbdvsp20group8finalprojectserverjava.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    UniversityRepository universityRepository;

    public Question createQuestion(Integer uid,Question question){
        University university = universityRepository.findById(uid).get();
        question.setUniversity(university);
        return questionRepository.save(question);
    }

    public List<Question> findAllQuestions(){
        return (List<Question>) questionRepository.findAll();
    }

    public List<Question> findQuestionsForUniversity(Integer uid){
        return questionRepository.findQuestionsForUniversity(uid);
    }

    public List<Question> findQuestionsForUser(Integer uid){
        return questionRepository.findQuestionsForUser(uid);
    }
}
