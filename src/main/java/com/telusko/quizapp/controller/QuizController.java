package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Quiz;
import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("/created")
    private ResponseEntity<String>  getQuestions(@RequestParam String category, @RequestParam int numQ,
                                                 @RequestParam String title){
        return quizService.createdQuiz(category,numQ,title);

    }

}
