package com.shortthirdman.coindcx.exception;

/**
 * A base exception class for the client
 * @author ShortThirdMan
 */
public class CoinDCXException extends RuntimeException {

    public CoinDCXException(String message) {
        super(message);
    }
}
