package rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class Locationss {
	
	@Test
	public void match() {
	
	 given().
	    when().
	        get("https://wbmobileqa.azurewebsites.net/latest/menu?menuVersion=5").
	    then().
        assertThat().
        statusCode(200);

	 
	}
	}
	


