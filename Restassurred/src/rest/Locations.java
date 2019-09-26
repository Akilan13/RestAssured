package rest;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.given;

public class Locations {
	

		
	@Test
    public void GetWeatherDetails()
    {   
           // Specify the base URL to the RESTful web service
           RestAssured.baseURI = "https://wbmobileqa.azurewebsites.net/v2.2/locations";

           // Get the RequestSpecification of the request that you want to sent
           // to the server. The server is specified by the BaseURI that we have
           // specified in the above step.
           RequestSpecification httpRequest = RestAssured.given();
           httpRequest.header("x-api-key","9024b9fa-66f5-485c-bd70-6bc2f8bffdda");
           httpRequest.header("Content-Type","application/json");
           

           // Make a request to the server by specifying the method Type and the method URL.
           // This will return the Response from the server. Store the response in a variable.
           Response response = httpRequest.request(Method.GET, "?q=2016");

           // Now let us print the body of the message to see what response
           // we have recieved from the server
           String responseBody = response.getBody().asString();
           System.out.println("Response Body is =>  " + responseBody);
           System.out.println(response.getStatusCode());
           
           

    }


	
	

		
	

}
	

