package api.testvalidation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import com.github.javafaker.Faker;

import api.baseURL.UserImplementation;
import api.datapayload.UserData;




public class UserValidation {
	
	
	Faker faker;
	UserData data;
	
	@BeforeClass
	public void setdata() 
	{
		
		faker = new Faker();
		data = new UserData();
		
		data.setName(faker.name().name());
		data.setJob(faker.job().position());
		
	}
	
	@Test
	public void CreateUser()
	{
	Response response =UserImplementation.createuser(data);
	  response.then().log().all();
	  Assert.assertEquals(response.getStatusCode(),201);
	 
	}
	
	
}
