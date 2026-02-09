package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagement;
import com.api.models.request.Loginrequest;
import com.api.models.request.profileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;
@Listeners(com.api.models.listeners.TestListeners.class)
public class UpdateProfileTest {


	
	@Test
	public void UpdateProfile() {
		
		
		AuthService authservice=new AuthService();
	Response response=	authservice.login(new Loginrequest("uday1234","uday12345"));
		
	LoginResponse loginresponse=response.as(LoginResponse.class);
	
	
	System.out.println(response.asPrettyString());
	
	
	System.out.println("Token"+loginresponse.getToken());
	
	System.out.println("-----------------------------------------------------------------------");
	
	UserProfileManagement updateprofile=new UserProfileManagement();
	response=updateprofile.getprofile(loginresponse.getToken());
	System.out.println(response.asPrettyString());
	UserProfileResponse userresponse=response.as(UserProfileResponse.class);
	
	System.out.println(userresponse.getUsername());
			System.out.println(userresponse.getUsername());
		System.out.println(userresponse.getEmail());
	System.out.println("------------------------------------------------------------------------------");
	
	
	profileRequest profilerequest	=new profileRequest.Builder()
			.FirStName("Disha1")
			.lasName("bhatt")
			.email("disha123@yahoo.com")
			.mobileNumber("9845678008")
			.build();
	
	Response res = updateprofile.updateprofile(loginresponse.getToken(), profilerequest);
	System.out.println(res.asPrettyString());
	}
}
