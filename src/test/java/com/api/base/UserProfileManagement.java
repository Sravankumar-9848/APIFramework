package com.api.base;

import com.api.models.request.profileRequest;

import io.restassured.response.Response;

public class UserProfileManagement  extends BaseService{
	private static final String BASE_PATH="/api/users";
	 
	
	public Response getprofile(String token) {
		Setauth(token);
		return getrequest(BASE_PATH+"/profile");
	}
	
	public Response updateprofile(String token, profileRequest payload) {
		Setauth(token);
		return putrequest(payload,BASE_PATH+"/profile");
	}

	

}
 