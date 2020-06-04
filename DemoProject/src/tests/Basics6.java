package tests;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Files.ResuableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basics6 {
	
Properties prop=new Properties();
	
	@BeforeTest
	public void getData() throws IOException{
		
		FileInputStream fis=new FileInputStream("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\DemoProject\\src\\Files\\env.properties");
		prop.load(fis);
	}
	
	@Test
	public void jiraAPI(){
		
		//Creating issue/Defect
		 RestAssured.baseURI="http://localhost:8080";
		Response resp=given().header("Content-Type","application/json").
		header("Cookie","JSESSIONID="+ResuableMethods.getSessionKey()).
		body("{\"body\": {"+
    "\"type\": \"doc\","+
    "\"version\": 1,"+
    "\"content\": ["+
      "{"+
        "\"type\": \"paragraph\","+
        "\"content\": ["+
          "{"+
            "\"type\": \"text\","+
            "\"text\": \"i am add comment\" "+
          "}"+
        "]"+
      "}"+
    "]"+
  "},"+
  "\"visibility\": {"+
    "\"type\": \"role\","+
    "\"value\": \"Administrators\""+
  "}"+
"}'").
		when().post(" /rest/api/3/issue/10207/comment").
		then().statusCode(201).
		extract().response();
		JsonPath json=ResuableMethods.rawToJSON(resp);
		String id=json.get("id");
		System.out.println(id);

	}
}
