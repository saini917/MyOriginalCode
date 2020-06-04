package tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Files.ResuableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Basics5 {
	
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
		body("{"+
"\"fields\": {"+
    "\"project\": {"+
      "\"key\": \"NRDA\"},"+
    "\"summary\": \"payment defect\","+
    "\"description\": \"Creating my first bug\","+
    "\"issuetype\": {"+
      "\"name\": \"bug\""+
    "}"+
   "}}").
		when().post("rest/api/3/issue").
		then().statusCode(201).
		extract().response();
		JsonPath json=ResuableMethods.rawToJSON(resp);
		String id=json.get("id");
		System.out.println(id);

	}

}
