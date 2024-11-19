package com.shortthirdman.coindcx.exception;

/**
 * Exception thrown when an API request fails
 * @author ShortThirdMan
 */
public class ApiRequestException extends RuntimeException {

    public ApiRequestException(String message) {
        super(message);
    }
}
