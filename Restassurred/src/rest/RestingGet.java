package rest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers.*;

public class RestingGet {
	
	@Test
	public void getwheather() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Chennai");
		String va = response.getBody().asString();
		System.out.println(va);
		String res = response.getStatusLine();
		Assert.assertEquals(res.contains("200"), true);
		//Assert.assertFalse(res.contains("200"));
		
	}

}
