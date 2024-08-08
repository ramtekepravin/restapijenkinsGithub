package api.baseURL;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.datapayload.UserData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;
import org.hamcrest.Matchers;


public  class UserImplementation {
	
// Create User Implementation
	
	@Test
	public static  Response createuser(UserData payload)
	{
		
		Response response =
		RestAssured
		  .given()
		    .contentType(ContentType.JSON)
		    .accept("ContentType.JSON")
		    .body(payload)
		    
		  .when()
		    .post(BaseURLs.createuser);
		
		return response;
	
	}
	
	
}
