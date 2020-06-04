package tests;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import Files.ResuableMethods;


public class Basics3 {

	@Test
	public void postData() throws IOException{
		String postdata=generateStringFromResource("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\DemoProject\\src\\Files\\postData.xml");

		RestAssured.baseURI="https://maps.googleapis.com";

		Response resp=given().
		queryParam("key","ChIJjRuIiTiuEmsRCHhYnrWiSok").and().

		body(postdata).

		when().post("maps/api/place/add/xml").

		then().
		assertThat().
		statusCode(201).and().contentType(ContentType.XML).and().
		body("status",equalTo("ok")).
		
		extract().response();
		
		XmlPath xml=ResuableMethods.rawToXML(resp);
		String x=xml.get("PlaceAddResponse.place_id");
		System.out.println(x);

	}



	public String generateStringFromResource(String path) throws IOException{
		return new String(Files.readAllBytes(Paths.get(path)));

	}

}
