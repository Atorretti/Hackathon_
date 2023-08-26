package org.academiadecodigo.countrydream.services;

import org.academiadecodigo.countrydream.exceptions.*;
import org.academiadecodigo.countrydream.persistence.model.Question;
import org.academiadecodigo.countrydream.persistence.model.Answer;

import java.util.List;

/**
 * Common interface for question services, provides methods to manage questions
 */
public interface QuestionService {

    /**
     * Gets the question with the given id
     *
     * @param id the question id
     * @return the question
     */
    Question get(Integer id);

    /**
     * Saves a question
     *
     * @param question the question to save
     * @return the saved custoemr
     */
    Question save(Question question);

    /**
     * Deletes the question
     *
     * @param id the question id
     * @throws QuestionNotFoundException
     * @throws AssociationExistsException
     */
    void delete(Integer id) throws AssociationExistsException, QuestionNotFoundException;

    /**
     * Gets a list of the questions
     *
     * @return the questions list
     */
    List<Question> list();

}
