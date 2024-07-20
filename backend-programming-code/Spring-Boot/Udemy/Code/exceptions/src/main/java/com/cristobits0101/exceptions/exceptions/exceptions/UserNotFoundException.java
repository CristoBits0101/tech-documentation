package com.cristobits0101.exceptions.exceptions.exceptions;

/**
 * RuntimeException a diferencia de Exception, no es necesario capturarlo.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
