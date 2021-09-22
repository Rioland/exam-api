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
@Table
public class Questions {
    

    @Column
    private String question;
    @Column
    private String a;
    @Column
    private String b;
    @Column
    private String c;
    @Column
    private String d;
    @Column
    private String categories;

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  

    public Questions() {
        super();
    }

  
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Questions(String question, String a, String b, String c, String d, String categories, int id) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.categories = categories;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", categories=" + categories + ", id=" + id + '}';
    }
    
    
    

}
