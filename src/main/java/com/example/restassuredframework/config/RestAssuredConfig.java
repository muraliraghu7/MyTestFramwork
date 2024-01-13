package com.example.restassuredframework.config;

public class RestAssuredConfig {
    private static RestAssuredConfig restAssuredConfig;

    private RestAssuredConfig() {

    }

    public static synchronized RestAssuredConfig getRestAssuredConfig() {
        if (restAssuredConfig == null) {
            restAssuredConfig = new RestAssuredConfig();
        }
        return restAssuredConfig;
    }
}
