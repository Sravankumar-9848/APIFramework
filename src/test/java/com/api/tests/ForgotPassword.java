package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {
	@Test
	public void forgortpassword (){
	 AuthService auth=new AuthService();
	    Response res=auth.forgotPaasword("bsk123868@gmail.com");
	    System.out.println("response"+res.asPrettyString());
	}
}
