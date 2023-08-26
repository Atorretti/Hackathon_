package org.academiadecodigo.countrydream.exceptions;

import org.academiadecodigo.countrydream.errors.ErrorMessage;

/**
 * Thrown to indicate that an association still exists
 */
public class AssociationExistsException extends CountryDreamException {

    /**
     * @see CountryDreamException#CountryDreamException(String)
     */
    public AssociationExistsException() {
        super(ErrorMessage.ASSOCIATION_EXISTS);
    }
}
