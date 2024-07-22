package com.cristobits0101.exceptions.exceptions.exceptions;

/**
 * RuntimeException a diferencia de Exception, no es necesario capturarlo.
 * Se utiliza con throw en el controlador.
 * Si es una exception que no existe por ejemplo cuando algo sea null la devuelve con trown como error.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
