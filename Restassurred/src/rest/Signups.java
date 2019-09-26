package rest;
import io.restassured.RestAssured;
import io.restassured.matcher.*;

import java.io.IOException;
import static com.jayway.restassured.RestAssured.given;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import com.jayway.restassured.*;


public class Signups {

	@Test
	public void post() throws IOException {

	   String jsonBody = ("Users\\kselvaraj\\eclipse-workspace\\Restassurred\\Signup.json");

	    given().
	            contentType("application/json").
	            body(jsonBody).
	    when().
	            post("https://wbmobileqa.azurewebsites.net/v2.2/accounts").
	    then().
	            statusCode(200);
	    
	
	}
	

}
