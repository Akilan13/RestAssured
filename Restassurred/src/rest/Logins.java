package rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Logins {
	
	@Test
    public void login()
    {   
           // Specify the base URL to the RESTful web service
           RestAssured.baseURI = "https://wbmobileqa.azurewebsites.net/v2.2/accounts/login";

           // Get the RequestSpecification of the request that you want to sent
           // to the server. The server is specified by the BaseURI that we have
           // specified in the above step.
           RequestSpecification httpRequest = RestAssured.given();
           httpRequest.header("x-api-key","9024b9fa-66f5-485c-bd70-6bc2f8bffdda");
           httpRequest.header("Content-Type","application/json");
           JSONObject requestParams = new JSONObject();
           requestParams.put("email", "Kselvaraj@wbhq.com");
           requestParams.put("Password", "burger01");
           httpRequest.body(requestParams.toJSONString());
           
           // Make a request to the server by specifying the method Type and the method URL.
           // This will return the Response from the server. Store the response in a variable.
           Response response = httpRequest.post("/login");

           // Now let us print the body of the message to see what response
           // we have recieved from the server

           System.out.println(response.getStatusCode());
           

    }


}
