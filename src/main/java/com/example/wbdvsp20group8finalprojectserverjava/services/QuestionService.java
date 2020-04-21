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

    public Question createQuestion(String universityName,Question question){
        University university = universityRepository.findUniversityByName(universityName);
        question.setUniversity(university);
        return questionRepository.save(question);
    }

    public List<Question> findAllQuestions(){
        return (List<Question>) questionRepository.findAll();
    }

    public List<Question> findQuestionsForUniversity(String universityName){
        return questionRepository.findQuestionsForUniversity(universityName);
    }

    public List<Question> findQuestionsForUser(Integer uid){
        return questionRepository.findQuestionsForUser(uid);
    }

    public int deleteQuestion(Integer qid){
        questionRepository.deleteById(qid);
        return 1;
    }

    public Question findQuestionById(Integer qid){
        return questionRepository.findById(qid).get();
    }
}
