package org.academiadecodigo.countrydream.services;

import org.academiadecodigo.countrydream.persistence.model.Answer;

/**
 * Common interface for answer services, provides methods to manage answers and perform answer transactions
 */
public interface AnswerService {

    /**
     * Gets the answer with the given id
     *
     * @param id the answer id
     * @return the answer
     */
    Answer get(Integer id);

}
