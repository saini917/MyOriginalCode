package tests;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import Files.Resources;
import Files.Payload;

public class Basics2 {
	
	Properties prop=new Properties();
	
	@BeforeTest
	public void getData() throws IOException{
		
		FileInputStream fis=new FileInputStream("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\DemoProject\\src\\Files\\env.properties");
		prop.load(fis);	
	}

	@Test
	public void addAndDeletePlace(){
		
		
		//Task 1- Grab the response
		 RestAssured.baseURI=prop.getProperty("HOST");

		Response resp=given().
		queryParam("key",prop.getProperty("KEY")).and().
		body(Payload.getPostData()).

		when().post(Resources.placePostData()).

		then().
		assertThat().
		statusCode(201).and().contentType(ContentType.JSON).and().
		body("status",equalTo("ok")).
		
		extract().response();
		
		//Task 2- Grab the Place ID from the response
		String responseString=resp.asString();
		System.out.println(responseString);
		JsonPath js=new JsonPath(responseString);
		String placeid=js.get("place_id");
		System.out.println(placeid);
		
		
		//Task 2- place this Place ID in the Delete request
		given().
		queryParam("key","ChIJjRuIiTiuEmsRCHhYnrWiSok").
		
		body("{"+
		"\"place_id\" : \" "+placeid+"\" "+
        "}").
		
		when().post("maps/api/place/delete/json").
		
		then().
		assertThat().
		statusCode(201).and().contentType(ContentType.JSON).and().
		body("status",equalTo("ok"));
		

	}
}


