package com.shortthirdman.coindcx.config;

public class CoinDCXConfigManager {

    private static CoinDCXConfigManager instance;

    private CoinDCXConfigManager() {
    }

    public static CoinDCXConfigManager getInstance() {
        if (instance == null) {
            instance = new CoinDCXConfigManager();
        }
        return instance;
    }
}
