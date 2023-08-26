package org.academiadecodigo.countrydream.controller.rest;

import org.academiadecodigo.countrydream.persistence.model.Question;
import org.academiadecodigo.countrydream.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * REST controller responsible for {@link Question} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/question")
public class RestQuestionController {

    private QuestionService questionService;

    /**
     * Sets the question service
     *
     * @param questionService the question service to set
     */
    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    /**
     * Retrieves a representation of the given question
     *
     * @param qid the question id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{qid}")
    public ResponseEntity<Question> showQuestion(@PathVariable Integer qid) {

        Question question = questionService.get(qid);

        if (question == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(question, HttpStatus.OK);
    }

}
