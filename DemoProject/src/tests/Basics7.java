package tests;
import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Files.ResuableMethods;
import io.restassured.RestAssured;

public class Basics7 {
	
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
		given().header("Content-Type","application/json").
		header("Cookie","JSESSIONID="+ResuableMethods.getSessionKey()).
		pathParams("commentid",10103).
		
		body("{\"body\": {"+
    "\"type\": \"doc\","+
    "\"version\": 1,"+
    "\"content\": ["+
      "{"+
        "\"type\": \"paragraph\","+
        "\"content\": ["+
          "{"+
            "\"type\": \"text\","+
            "\"text\": \"i am update comment\" "+
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
		//when().put(" /rest/api/3/issue/10207/comment/10103").
		when().put(" /rest/api/3/issue/10207/comment/{commentid}").
		then().statusCode(200).
		extract().response();

	}
}
