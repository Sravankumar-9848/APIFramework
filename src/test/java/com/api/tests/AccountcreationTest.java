package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.signupRequest;
import com.api.models.request.signupRequest.Builder;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AccountcreationTest {

	
	@Test
	public void createAccount() { 
	 
		long time = System.currentTimeMillis();

		/*
		 * signupRequest signupRequest = new signupRequest.Builder() .username("joy" +
		 * time) .email("joy" + time + "@yahoo.com") .firstName("Joy"+time)
		 * .lastName("User"+time) .mobileNumber("9"+String.valueOf(time).substring(0,
		 * 9)) .password("Joy@" + time) .build();
		 */
		
		
		/*
		 * signupRequest signupRequest = new signupRequest.Builder()
		 * .username("abc9848") .email("abc656@yahoo.com") .firstName("dihja")
		 * .lastName("bhaoot") .mobileNumber("9147397885") .password("abc123") .build();
		 */
				
		String payload = "\"username\": \"abc9848\",\r\n"
				+ "			  \"password\": \"abc123\",\r\n"
				+ "			  \"email\": \"abc656@yahoo.com\",\r\n"
				+ "			  \"firstName\": \"dihja\",\r\n"
				+ "			  \"lastName\": \"bhaoot\",\r\n"
				+ "			  \"mobileNumber\": \"9147397885\"";
		
			 
	
		
		
		
		
		
		/*
		 * AuthService auth=new AuthService(); Response response =
		 * auth.signup(signupRequest); System.out.println(response.asPrettyString());
		 */
		
		
		Response response = given().baseUri("http://64.227.160.186:8080")
		        .contentType(ContentType.JSON)
		        .body(payload)
		.when()
		        .post("/api/auth/signup");

		System.out.println(response.asPrettyString());
	

	}

	

	
}
