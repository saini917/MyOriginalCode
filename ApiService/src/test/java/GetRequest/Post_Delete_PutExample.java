package GetRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_PutExample {
	
	@Test
	public void test(){
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id",25);
		json.put("title", "Selenium webdriver");
		json.put("author","learn automation");
		request.body(json.toJSONString());
		
		Response response=request.post("url");
		int code=response.statusCode();
		
		Assert.assertEquals(code,201 );
	}

}
