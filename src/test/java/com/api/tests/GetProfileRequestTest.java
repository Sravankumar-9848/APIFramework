package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagement;
import com.api.models.request.Loginrequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;
@Listeners(com.api.models.listeners.TestListeners.class)
public class GetProfileRequestTest {
@Test
public void getProfileInfo() {
	AuthService authservice=new AuthService();
	Response res=authservice.login(new Loginrequest("uday1234","uday12345"));
	LoginResponse loginresponse = res.as(LoginResponse.class);
   System.out.println(loginresponse.getToken());
   
   UserProfileManagement userprofilemanagement=new  UserProfileManagement();
   Response res11= userprofilemanagement.getprofile(loginresponse.getToken());
   
  System.out.println(res11.asPrettyString());
  UserProfileResponse profile = res11.as(UserProfileResponse.class);
  
  System.out.println(profile.getEmail());
  System.out.println(profile.getUsername());
  System.out.println(profile.getId());
  
}
} 
