package com.telusko.quizapp.controller;

import com.telusko.quizapp.exception.ErrorResponse;
import com.telusko.quizapp.exception.IdNotFoundException;
import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
    public ResponseEntity<?> getById(@PathVariable Integer id){
            Question ques = questionService.getById(id).
                    orElseThrow(() -> new IdNotFoundException("The Question is not found with provided id " + id));
            return new ResponseEntity<>(ques, HttpStatus.FOUND);
    }

    @GetMapping("/getting/{id}")
    public ResponseEntity<?> getByQueGreterThanId(@PathVariable Integer id){
            List<Question> ques = questionService.getByQuesGreterId(id);

            return Optional.ofNullable(ques)
                    .filter(list -> !list.isEmpty())
                    .map(list -> new ResponseEntity<>(list, HttpStatus.OK))
                    .orElseThrow(() -> new IdNotFoundException("No questions found with ID greater than " + id));

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
