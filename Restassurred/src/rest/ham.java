package rest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.hasSize;;


public class ham {

	@Test
	public void test_ResponseHeaderData_ShouldBeCorrect() {
	        
		 given().
		 log().all().
		    when().
		        get("http://ergast.com/api/f1/2017/circuits.json").
		    then().
		        assertThat().
		        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).and().contentType(ContentType.JSON).and().assertThat().statusCode(200);
}
}
