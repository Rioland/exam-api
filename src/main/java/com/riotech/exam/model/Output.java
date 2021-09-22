/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riotech.exam.model;

/**
 *
 * @author user
 */
public class Output {
    private  String Code,message;

    public Output(String Code, String message) {
        this.Code = Code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Output{" + "Code=" + Code + ", message=" + message + '}';
    }

    public Output() {
    }
    

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
