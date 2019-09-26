package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Login {
	
	@Test
	public void logintest() {
	RestAssured.baseURI = "https://wbmobileqa.azurewebsites.net/v2.2/accounts/login";
	PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
	authScheme.setUserName("kselvaraj@wbhq.com");
	authScheme.setPassword("burger0001");
	RestAssured.authentication = authScheme;
	System.out.println(authScheme.generateAuthToken());
    
	}

}
