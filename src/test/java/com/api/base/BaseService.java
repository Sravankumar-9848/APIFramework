package com.api.base;



import static io.restassured.RestAssured.*;

import com.api.models.request.Loginrequest;
import com.api.models.response.LoginResponse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	//uri
	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestspecfication;
	
	public BaseService() {
		super();
		requestspecfication =given().baseUri(BASE_URL);
		
	}
	protected Response postrequest(Object payload,String endpoint) {
	  return requestspecfication.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	/*
	 * public LoginResponse Getauthenaction(Object payload,String Username,String
	 * Password) {
	 * 
	 * 
	 * AuthService authservice=new AuthService(); Response res=authservice.login(new
	 * Loginrequest( Username,Password)); return res.as(LoginResponse.class);
	 * 
	 * }
	 */
	protected Response putrequest(Object payload,String endpoint) {
		  return requestspecfication.contentType(ContentType.JSON).body(payload).put(endpoint);
		}
	
	
	protected Response getrequest(String endpoint) {
		  return requestspecfication.get(endpoint);
		}
	
	protected void Setauth(String token) {
		  requestspecfication.headers("Authorization","Bearer "+token);
		}
	
	

}
