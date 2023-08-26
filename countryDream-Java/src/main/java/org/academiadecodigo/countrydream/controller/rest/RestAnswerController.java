package org.academiadecodigo.countrydream.controller.rest;


import org.academiadecodigo.countrydream.persistence.model.Question;
import org.academiadecodigo.countrydream.persistence.model.Answer;
import org.academiadecodigo.countrydream.services.AnswerService;
import org.academiadecodigo.countrydream.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller responsible for {@link Answer} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/question")
public class RestAnswerController {

    private QuestionService questionService;
    private AnswerService answerService;

    /**
     * Sets the Question service
     *
     * @param questionService the Question service to set
     */
    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    /**
     * Sets the Answer service
     *
     * @param answerService the Answer service to set
     */
    @Autowired
    public void setAnswerService(AnswerService answerService) {
        this.answerService = answerService;
    }

    /**
     * Retrieves a representation of the given Question Answers
     *
     * @param qid the Question id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{qid}/answer")
    public ResponseEntity<List<Answer>> listQuestionAnswers(@PathVariable Integer qid) {

        Question Question = questionService.get(qid);

        if (Question == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<Answer> answers = Question.getAnswers();

        return new ResponseEntity<>(answers, HttpStatus.OK);
    }

}


