package com.example.wbdvsp20group8finalprojectserverjava.repositories;

import com.example.wbdvsp20group8finalprojectserverjava.models.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question,Integer> {

    @Query("SELECT question FROM Question question WHERE question.university.id=:uid")
    public List<Question> findQuestionsForUniversity(@Param("uid") Integer uid);

    @Query("SELECT question FROM Question question WHERE question.user.id=:uid")
    public List<Question> findQuestionsForUser(@Param("uid") Integer uid);
}
