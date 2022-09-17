package latihan.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleRestAssured {

	JSONObject req;
	
	@BeforeTest
	public void befTest()
	{
		req = new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
//	@Test(priority=0)
//	public void testPost()
//	{
//		
//		req.put(req, req)
//		given().
//			header("Content-Type","application/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(null)
//			
//	}
	
	@Test(priority =1)
	public void testGet()
	{
		
//		?id=4&
		given().
		header("","").accept("JSON").
		param("first_name","Andhika").and().param("", "").and().
		param("","").and().param("first_name","Andhika").and().
		param("", "").and().param("","").and().param("first_name","Andhika").
		and().param("", "").and().param("","").and().param("first_name","Andhika").
		and().param("", "").and().param("","").
		when().
		get("/users").
		then().
		statusCode(200).log().all();
	}
	
//	@Test(priority=0)
//	public void testPost()
//	{
//		
//		req.put("first_name","Tom");
//		req.put("last_name","Churuz");
//		req.put("subject_id",2);
//		
//		given().
//			header("Content-Type","application/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
////		when().
//			post("/users").
//		then().
//			statusCode(201).log().all();			
//	}
//	
//	@Test(priority=3)
//	public void testPut()
//	{
//		
//		req.put("last_name","Maldini");
//		req.put("first_name","Andhika");
//		req.put("subject_id",1);
//		
//		given().
//			header("Content-Type","application/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().
//			patch("/users/4").
//		then().
//			statusCode(200);
//			
//	}
	
//	@Test(priority=4)
//	public void testDelete()
//	{	
//		when().
//		delete("/users/7").
//		then().
//		statusCode(200).log().all();
//			
//	}

}