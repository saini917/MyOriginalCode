import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class Basics1 {
	
	@Test
	public void postData(){
		
		RestAssured.baseURI="https://reqres.in/";
		
		given().
				//queryParam("key","ChIJjRuIiTiuEmsRCHhYnrWiSok").and().
				body("{"+
					"\"name\": \"morpheus\","+
					"\"job\": \"leader\" "+
	"}").
				
				when().post("/api/users").
				
				 then().
	        		assertThat().
	        					statusCode(201).and().contentType(ContentType.JSON).and().
	        					body("status",equalTo("ok"));
			
	}

}
