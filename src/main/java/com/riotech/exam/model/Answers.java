/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riotech.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Answers")
public class Answers {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String answer;
    
    @Column
    private int questionid;
    @Column
    private String opt;

    @Override
    public String toString() {
        return "Answers{" + "id=" + id + ", answer=" + answer + ", questionid=" + questionid + ", opt=" + opt + '}';
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public Answers(int id, String answer, int questionid, String opt) {
        this.id = id;
        this.answer = answer;
        this.questionid = questionid;
        this.opt = opt;
    }

   

    public Answers() {
        super();
    }
    
    
}
