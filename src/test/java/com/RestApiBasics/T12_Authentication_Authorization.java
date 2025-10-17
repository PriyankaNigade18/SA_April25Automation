package com.RestApiBasics;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
/*
 * given():Prerequisite
 * ---------------------------------
 * Request payload,header,path parameter,query parameter,Authorization
 * 
 * when():Request-endpoint
 * ------------------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then():validate
 * ---------------------------------
 * status code,status message, cookies, header, response time,response payload
 */
public class T12_Authentication_Authorization 
{
	 String loginToken;
	 
  @Test(priority=1)
  public void basicAuthTest()
  {
	  
	  System.out.println("--------Basic Authentication-------------");
	  //basic Auth: Base64 algorithm
	  Response res=given()
			  		.auth().basic("postman","password")
	  
			  			.when().get("https://postman-echo.com/basic-auth");
	  
	  //log the result
	  res.then().log().body();
	  
	  //assertion
	  Assert.assertEquals(res.getStatusCode(),200);
	  
	  //json validation
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  Assert.assertEquals(status,true);
	  
	  
  }
  
  @Test(priority=2)
  public void testDigestAuth()
  {
	  System.out.println("--------Digest Authentication(MD5/SHA)-------------");
	  
	  Response res=given()
			  			.auth().digest("postman","password")
	  
			  				.when().get("https://postman-echo.com/digest-auth");
	  
	  //log the result
	  res.then().log().body();
	  
	  Assert.assertEquals(res.getStatusCode(),200,"Test Fail!");
	  System.out.println("Test Pass!");
  }
  
  
  @Test(priority=3)
  public void generateBearerToken()
  {
	  System.out.println("---------------Use case for Generate Bearer Token---------");

	  //request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("email","test1818@gmail.com");
	  map.put("password","test123");
	  
	  Response res=given()
			  		.header("Content-Type","application/json")
			  			.body(map)
	  			  			.when().post("https://thinking-tester-contact-list.herokuapp.com/users/login");
	  
	  //log the body
	  res.then().log().body();
	  
	  
	  //to get the token
	  
	   loginToken=res.jsonPath().getString("token");
	  
	  System.out.println("Token generated!: "+loginToken);
	  
	  
  }
  
  @Test(priority=4)
  public void useBearerToken()
  {
	  
	  System.out.println("---------------Use case for Bearer Token---------");
	  Response res=given()
			  			.header("Authorization","Bearer "+loginToken)
			  			.when().post("https://thinking-tester-contact-list.herokuapp.com/users/logout");
	  
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("User logout is completed!");
  }
  
  @Test
  public void testOauth2()

  {
	  Response res=given()
			  			.auth().oauth2("access token ")
			  			.when().get("https://api.github.com/user/repos");
	  
	  res.then().log().body();
	  
	  
  }
  
  
  
  
  
  
}
