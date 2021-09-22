/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riotech.exam.Respository;

import com.riotech.exam.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author user
 */
public interface AnswerRepo extends JpaRepository<Answers, Integer>{
  
    @Query(value = "SELECT * FROM Answers WHERE questionid=?1",nativeQuery = true)
    Answers findSingleAnswer(int qid);
    
}
