package WebservicesTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC1_GET_Request {

	@Test
	public void getWeatherDetials()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city"; // URI
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.request(Method.GET,"/Delhi");
		
		//Extract body from response
		String responsebody=response.getBody().asString(); // captured the response body from jon to string format
		System.out.println(responsebody);
		
		int statusCode=response.getStatusCode(); //CAPTURE STATUS CODE
		String statusLine=response.getStatusLine();  // CAPTURE STATUS LINE
		
		//validatation
		
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	
}
