package com.telusko.quizapp.service;

import com.telusko.quizapp.dao.DaoRepository;
import com.telusko.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    DaoRepository daoRepository;

    public Question addQuestion(Question question) {
      return daoRepository.save(question);
    }


    public List<Question> getQuestions() {
        return daoRepository.findAll();
    }

    public Optional<Question> getById(Integer id) {
        return daoRepository.findById(id);
    }

    public List<Question> getByCate(String category) {
        return daoRepository.findByCategory(category);
    }

    public List<Question> getByQuesGreterId(Integer id) {
        return daoRepository.findByIdGreaterThan(id);
    }
}
