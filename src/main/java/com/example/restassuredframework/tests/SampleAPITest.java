package com.example.restassuredframework.tests;

import com.example.restassuredframework.config.RestAssuredConfig;
import com.example.restassuredframework.utils.LoggerUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleAPITest {
    private RestAssuredConfig restAssuredConfig;
    private Logger logger;

    @BeforeClass
    public void setUpRestAssuredConfig() {
        restAssuredConfig = RestAssuredConfig.getRestAssuredConfig();
        logger = LoggerUtil.getLoggerInstance();
    }

    @Test
    public void sampleApiCall() {
        logger.info("Starting a simple api test");
        RestAssured.baseURI = "https://reqres.in";
        Response response =given().queryParam("page", 2).log().all().when().get("/api/users");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getBody().asString());
        logger.info("Test successful, status code is 200");



    }
}
