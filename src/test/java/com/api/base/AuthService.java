package com.api.base;

import java.util.HashMap;

import com.api.models.request.Loginrequest;

import io.restassured.response.Response;

public class AuthService  extends BaseService{
	private static final String BASE_PATH="/api/auth/";
	
	public Response login(Object payLoad) {
		return postrequest(payLoad,BASE_PATH+"login");
	}
	
	public Response signup(Object payLoad) {
		return postrequest(payLoad,BASE_PATH+"/signup");
	}
	public Response forgotPaasword(String email) {
		HashMap<String ,String> payload =new HashMap<String ,String>();
		payload.put("email", email);
		return postrequest(payload,BASE_PATH+"/forgot-password");
	}

}
