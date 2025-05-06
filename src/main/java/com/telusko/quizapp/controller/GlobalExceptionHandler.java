package com.telusko.quizapp.controller;

import com.telusko.quizapp.exception.ErrorResponse;
import com.telusko.quizapp.exception.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<?> handleQuestionNotFoundException(IdNotFoundException e){
        ErrorResponse quesNotFound = new ErrorResponse(LocalDateTime.now(),e.getMessage(),"Question not found");
        return  new ResponseEntity<>(quesNotFound, HttpStatus.NOT_FOUND);
    }
}
