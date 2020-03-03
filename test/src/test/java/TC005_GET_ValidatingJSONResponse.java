import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class TC005_GET_ValidatingJSONResponse {

		public void GetWeatherDetails()
	{
		
		//Specify base URI
				RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
				
				//Request object
				RequestSpecification httpRequest=RestAssured.given();
				
				//Response object
				Response response=httpRequest.request(Method.GET,"/Delhi");
				
				//print response in console window
				String responseBody=response.getBody().asString();
				System.out.println("Response Body is:" +responseBody);
				
				Assert.assertEquals(responseBody.contains("Delhi"),true);
			
			
	}
	
	
}
