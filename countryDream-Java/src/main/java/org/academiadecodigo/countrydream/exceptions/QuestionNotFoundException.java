package org.academiadecodigo.countrydream.exceptions;

import org.academiadecodigo.countrydream.errors.ErrorMessage;

/**
 * Thrown to indicate that the customer was not found
 */
public class QuestionNotFoundException extends CountryDreamException {

    /**
     * @see CountryDreamException#CountryDreamException(String)
     */
    public QuestionNotFoundException() {
        super(ErrorMessage.QUESTION_NOT_FOUND);
    }
}
