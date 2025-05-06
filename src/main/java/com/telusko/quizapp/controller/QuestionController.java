package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ques")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/msg")
    public List<Question> getQuestions(){
        return  questionService.getQuestions();
    }

    @GetMapping("/get/{id}")
    public Optional<Question> getById(@PathVariable Integer id){
       return questionService.getById(id);
    }

    @GetMapping("/getting/{id}")
    public List<Question> getByQueGreterThanId(@PathVariable Integer id){
        System.out.println("This is data get by Question greater than Id");
        return questionService.getByQuesGreterId(id);

    }

    @GetMapping("/cate/{category}")
    public List<Question> getByCategory(@PathVariable String category){
        return questionService.getByCate(category);
    }


    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){

        Question savedQue = questionService.addQuestion(question);
        return new ResponseEntity<Question>(savedQue, HttpStatus.ACCEPTED);
    }

}
