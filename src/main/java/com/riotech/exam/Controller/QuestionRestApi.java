package com.riotech.exam.Controller;

import com.riotech.exam.Respository.AnswerRepo;
import com.riotech.exam.Respository.ExamRepo;
import com.riotech.exam.model.Answers;
import com.riotech.exam.model.Output;
import com.riotech.exam.model.Questions;
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

@RestController
@RequestMapping("/api/questions")
public class QuestionRestApi {

    @Autowired
    private ExamRepo examRepo;

//for all question

    @GetMapping(value = "/get")
    public List<Questions> getQuestion() {
        return examRepo.findAll();

    }
    
     @GetMapping(path = "/get/{id}")
    public Questions getSingleQuestion(@PathVariable int id) {
        return examRepo.findSingleById(id);

    }
    

    @GetMapping(path = "/category/{category}")
    public List<Questions> getQuestionBaseOnCategory(@PathVariable String category) {
        return examRepo.findByCategory(category);

    }

    @DeleteMapping(value = "/remove/{id}")
    public Output deleteQuestion(@PathVariable int id) {
        Questions qs = examRepo.findById(id).get();
        examRepo.delete(qs);
        return new Output("200", "Deleted");

    }

    @PutMapping(value = "/update/{id}")
    public Output updateQuestion(@PathVariable int id, @RequestBody Questions questions) {

        Questions qs = examRepo.findById(id).get();
        qs.setA(questions.getA());
        qs.setB(questions.getB());
        qs.setC(questions.getC());
        qs.setD(questions.getD());
        qs.setQuestion(questions.getQuestion());
        qs.setCategories(questions.getCategories());
        examRepo.save(qs);

        return new Output("200", "Updated");

    }

    @PostMapping(value = "/add")
    public Output addQuestion(@RequestBody Questions questions) {
        Output output = new Output();

        examRepo.save(questions);
        output.setCode("200");
        output.setMessage("SAVE");

        return output;

    }


    
        
    
}
