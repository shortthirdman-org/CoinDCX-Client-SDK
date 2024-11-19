package com.shortthirdman.coindcx.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinDCXClient {

    private static final Logger logger = LoggerFactory.getLogger(CoinDCXClient.class);
    private final String apiKey;
    private final String apiSecret;
    private final int connectionTimeout;
    private final int readTimeout;

    public CoinDCXClient(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.connectionTimeout = 3600;
        this.readTimeout = 6000;
    }

    public CoinDCXClient(String apiKey, String apiSecret, int connectionTimeout, int readTimeout) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
    }
}
