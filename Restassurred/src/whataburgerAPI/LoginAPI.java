package whataburgerAPI;



import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.hasSize;;

public class LoginAPI {
	
    private static String payload = "{\n" +
            "  \"Email\": \"qawbaloha@gmail.com\",\n" +
            "  \"Password\": \"Burger1950!\",\n" +
            "}";
	@Test
	public void login() {
		
		String BaseURL = "https://wbmobileqa.azurewebsites.net/latest/accounts/login";

		
		given().
		header("x-api-key","9024b9fa-66f5-485c-bd70-6bc2f8bffdda").
		header("Content-Type", "application/json").body(payload).log().all().
		when().post(BaseURL).
		then().assertThat().statusCode(200);
		
	}

}
