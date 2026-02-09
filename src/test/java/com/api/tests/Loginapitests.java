package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Loginapitests {

	
	public class loginapitest{
		
		@Test(description="")
		public void logintest() {
			
			RestAssured.baseURI="http://64.227.160.186:8080"; 
			RequestSpecification x = RestAssured.given();
			RequestSpecification y = x.header("content-Type","application/json");
			 RequestSpecification z = y.body("{\r\n"
			                       		+ "  \"username\": \"uday1234\",\r\n"
			                       		+ "  \"password\": \"uday1234\"\r\n"
			                       		+ "}");
			 Response a = z.post("/api/auth/login");
			 System.out.println(a.asPrettyString());
			 Assert.assertEquals(a.getStatusCode(), 200);
		} 
		
	}
}
