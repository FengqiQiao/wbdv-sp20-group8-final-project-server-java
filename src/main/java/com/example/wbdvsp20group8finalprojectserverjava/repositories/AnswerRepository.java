package com.example.wbdvsp20group8finalprojectserverjava.repositories;

import com.example.wbdvsp20group8finalprojectserverjava.models.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer,Integer> {

    @Query("SELECT answer FROM Answer answer WHERE answer.question.id=:qid")
    public List<Answer> findAnswersForQuestion(@Param("qid") Integer qid);

}
