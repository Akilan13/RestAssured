package rest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class Signup {
	
	@SuppressWarnings("unchecked")
	public void signsup() {
	// Specify the base URL to the RESTful web service
    RestAssured.baseURI = "https://wbmobileqa.azurewebsites.net/v2.2/accounts";

    // Get the RequestSpecification of the request that you want to sent
    // to the server. The server is specified by the BaseURI that we have
    // specified in the above step.
    RequestSpecification request = RestAssured.given();
    
    
    request.header("x-api-key","9024b9fa-66f5-485c-bd70-6bc2f8bffdda");
    request.header("Content-Type","application/json");
    JSONObject requestParams = new JSONObject();

	requestParams.put("firstName", "Virender"); // Cast
	requestParams.put("lastName", "Singh");
	requestParams.put("email", "sdimpleuser2dd2011");
	requestParams.put("password", "Password");
	
	
	requestParams.put("dateOfBirth", "1988-03-28T04:59:29.894Z"); // Cast
	requestParams.put("zipCode", "78701");
	requestParams.put("hasSubcribedToEmail",true);
	requestParams.put("aavatarId", 0);
	
	requestParams.put("DeviceId", "1234563"); // Cast
	requestParams.put("ModelName", "6SE");
	requestParams.put("ManufacturerName", "Apple");
	requestParams.put("CustomName", "PremApple");
	
	
	requestParams.put("Latitude", "29.4087"); // Cast
	requestParams.put("Longitude", "-98.4819");
	requestParams.put("TimeZoneName","Central Standard Time");
	
	
	request.body(requestParams.toJSONString());
	Response response = request.post("/signup");
	
	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, "200");



	}

}
