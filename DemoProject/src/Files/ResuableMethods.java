package Files;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ResuableMethods {

	public static XmlPath rawToXML(Response response){

		String resp=response.asString();
		XmlPath xml= new XmlPath(resp);
		return xml;
	}

	public static JsonPath rawToJSON(Response response){

		String resp=response.asString();
		JsonPath json= new JsonPath(resp);
		return json;
	}


	public static String getSessionKey(){
		//Creating session
		RestAssured.baseURI="http://localhost:8080";
		Response resp=given().header("Content-Type","application/json").
				body("{ \"username\": \"deepak\", \"password\": \"Saini@1987\" }").

				when().
				post("/rest/auth/1/session").

				then().statusCode(200).

				extract().response();
		JsonPath json=ResuableMethods.rawToJSON(resp);
		String session_id=json.get("session.value");
		System.out.println(session_id);
		return session_id;
	}

	public static String getDefectID(){
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
				when().post("/rest/api/3/issue/+\"id\"+/comment").
				then().statusCode(201).
				extract().response();
		JsonPath json=ResuableMethods.rawToJSON(resp);
		String id=json.get("id");
		System.out.println(id);
		return id;

	}
	
	
	public static String getCommentID(){
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
				when().post(" /rest/api/3/issue/+\"id\"+/comment").
				then().statusCode(200).
				extract().response();
		JsonPath json=ResuableMethods.rawToJSON(resp);
		String id=json.get("id");
		System.out.println(id);
		return id;

	}
}


