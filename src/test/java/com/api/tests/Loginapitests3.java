package com.api.tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.Loginrequest;
import com.api.models.response.LoginResponse;

public class Loginapitests3 {

	@Test(description="verify login is working")
	public static void loginapitest(){
		Loginrequest loginrequest=new Loginrequest("uday1234","uday12345");
    AuthService auth=new AuthService();
    Response res=auth.login(loginrequest);
    System.out.println(res.asPrettyString());
    LoginResponse loginresponse = res.as(LoginResponse.class);
   System.out.println(loginresponse.getToken());
      
     Assert.assertTrue(loginresponse.getToken()!=null);
     Assert.assertEquals(loginresponse.getEmail(),"ALOK1234@yahoo.com");

    }
	
}

