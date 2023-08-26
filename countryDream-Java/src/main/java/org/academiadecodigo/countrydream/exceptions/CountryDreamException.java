package org.academiadecodigo.countrydream.exceptions;

/**
 * A generic java bank exception to be used as base for concrete types of exceptions
 *
 * @see Exception
 */
public class CountryDreamException extends Exception {

    /**
     * @see Exception#Exception(String)
     */
    public CountryDreamException(String message) {
        super(message);
    }
}
