package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void testResponseCode(){
		
		//Response response=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		Response response=RestAssured.get("http://192.168.126.15:9081/NRDAuthorityPreUAT/");
		int responseCode=response.getStatusCode();
		System.out.println("Status code id: "+responseCode);
		Assert.assertEquals(responseCode,200);
	}
	
	@Test
	public void testResponseBody(){
		
		//Response response=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		Response response=RestAssured.get("http://192.168.126.15:9081/NRDAuthorityPreUAT/");
		String data=response.asString();
		System.out.println("Data is : "+data);
		System.out.println("Response time is : "+response.getTime());
	}

}
