package org.academiadecodigo.countrydream.exceptions;

import org.academiadecodigo.countrydream.errors.ErrorMessage;

/**
 * Thrown to indicate that the account was not found
 */
public class AnswerNotFoundException extends CountryDreamException {

    /**
     * @see CountryDreamException#CountryDreamException(String)
     */
    public AnswerNotFoundException() {
        super(ErrorMessage.ANSWER_NOT_FOUND);
    }
}
