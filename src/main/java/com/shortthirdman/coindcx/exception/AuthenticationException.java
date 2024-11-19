package com.shortthirdman.coindcx.exception;

/**
 * Exception for authentication failures
 * @author ShortThirdMan
 */
public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String message) {
        super(message);
    }
}
