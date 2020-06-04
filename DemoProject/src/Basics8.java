import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

//https://mvnrepository.com/artifact/com.github.scribejava/scribejava-apis/2.5.3
//https://mvnrepository.com/artifact/com.github.scribejava/scribejava-core/2.5.3

public class Basics8 {
	String ConsumerKey="";
	String ConsumerSecret="";
	String Token="";
	String TokenSecret="";
	String jsonResponseID;

	@Test
	public void getLatestTweet(){

		RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
		Response resp=given().auth().oauth(ConsumerKey,ConsumerSecret, Token, TokenSecret).
				queryParam("count","1").

				when().get("/home/timeline.json").
				then().extract().response();

		String response=resp.asString();
		System.out.println(response);
		JsonPath json=new JsonPath(response);
		
		System.out.println("Below is the tweet added");
		
		String jsonResponseText=json.get("text");
		System.out.println(jsonResponseText);
		
		jsonResponseID=json.get("id");
		System.out.println(jsonResponseID);

	}


	@Test
	public void createTweet(){

		RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
		Response resp=given().auth().oauth(ConsumerKey,ConsumerSecret, Token, TokenSecret).
				queryParam("status","i am creating this tweet with automation").

				when().post("/update.json").
				then().extract().response();

		String response=resp.asString();
		System.out.println(response);
		JsonPath json=new JsonPath(response);
		
	    jsonResponseID=json.get("id").toString();
		System.out.println(jsonResponseID);
	}
	
	@Test
	public void deleteTweet(){

		RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
		Response resp=given().auth().oauth(ConsumerKey,ConsumerSecret, Token, TokenSecret).

				when().post("/destroy/"+jsonResponseID+".json").
				then().extract().response();

		String response=resp.asString();
		System.out.println(response);
		JsonPath json=new JsonPath(response);

		System.out.println("Tweet got deleted with automation is below:");
		String jsonResponseText=json.get("text");
		System.out.println(jsonResponseText);
		
		String jsonResponseDeleted=json.get("truncated");
		System.out.println(jsonResponseDeleted);

	}

}
