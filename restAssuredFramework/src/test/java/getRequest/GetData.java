package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponseCode() {
		Response resp = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.getStatusCode(); 
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testDetail() {
		given()
			.pathParam("ID", "33")
			.contentType(ContentType.JSON)
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/{ID}")
		.then()
			.statusCode(200);
			//.body("FIRSTNAME", equalTo("Mary"));
	}

}
