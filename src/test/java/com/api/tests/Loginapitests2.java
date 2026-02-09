package com.api.tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.api.models.listeners.TestListeners.class)
public class Loginapitests2 {

	@Test
	public static void loginapitest(){
        // 1️⃣ Login API request
        Response res=given().baseUri("http://64.227.160.186:8080")
        .header("content-Type","application/json") 
        .body("{\r\n"
        		+ "  \"username\": \"uday1234\",\r\n"
        		+ "  \"password\": \"uday1234\"\r\n"
        		+ "}")
        .post("api/auth/login");
        System.out.println(res.asPrettyString());
       
    }
	
}

