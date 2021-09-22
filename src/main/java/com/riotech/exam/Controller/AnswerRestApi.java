/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riotech.exam.Controller;

import com.riotech.exam.Respository.AnswerRepo;
import com.riotech.exam.model.Answers;
import com.riotech.exam.model.Output;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/api/answer")
public class AnswerRestApi {

    @Autowired
    private AnswerRepo answerRepo;

    @PostMapping(value = "/add")
    public Output addAnswer(@RequestBody Answers answers) {
        Output output = new Output();

        answerRepo.save(answers);
        output.setCode("200");
        output.setMessage("SAVE");

        return output;

    }

    @PutMapping(value = "/update/{id}")
    public Output updateAnswer(@PathVariable int id, @RequestBody Answers answers) {

        Answers ans = answerRepo.findById(id).get();
        ans.setAnswer(answers.getAnswer());
        ans.setQuestionid(answers.getQuestionid());
        answerRepo.save(ans);
        return new Output("200", "Updated");

    }

    @DeleteMapping(value = "/remove/{id}")
    public Output deleteAnswer(@PathVariable int id) {
        Answers ans = answerRepo.findById(id).get();
        answerRepo.delete(ans);
        return new Output("200", "Deleted");

    }

    @GetMapping(value = "/get")
    public List<Answers> getAnswer() {
        return answerRepo.findAll();

    }

    @GetMapping(path = "/get/{questionId}")
    public Answers getSingleAnwser(@PathVariable int questionId) {
        return answerRepo.findSingleAnswer(questionId);

    }

}
