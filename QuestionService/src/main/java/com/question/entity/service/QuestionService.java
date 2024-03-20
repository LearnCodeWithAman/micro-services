package com.question.entity.service;


import com.question.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long questionId);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
