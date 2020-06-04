package tests;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import Files.ResuableMethods;

public class Basics4 {

	@Test
	public void getData() {

		//BaseUrl or Host
		RestAssured.baseURI="https://maps.googleapis.com";

		Response resp=given().
				param("location","-33.8670522,151.1957362").
				param("radius","1500").
				param("key","AIzaSyDZHTAd5YkWev-8bAB2SMEPovqeWsKAQI0").log().all().

				when().
				get("maps/api/place/nearbysearch/json").

				then().
				assertThat().
				statusCode(200).and().contentType(ContentType.JSON).and().log().body().
				extract().response();
				JsonPath json=ResuableMethods.rawToJSON(resp);
				int count=json.get("results.size()");
				System.out.println("Total Size :"+count);
				
				for(int index=0;index<count;index++){
					String city_name=json.get("results["+index+"].name");
					System.out.println(city_name);
				}
				

	}

}
