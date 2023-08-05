package api.rest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class RestAuto {
	public String domain = "https://jsonplaceholder.typicode.com";
	public String URI = "/posts/";
	public String queryString = "2";
	
	//@Test
	public void getReadTheDataFromServer() {
		 given().param("Content-Type", "application/json; charset=utf-8")
		.when().get(domain+URI+queryString)
		.then().assertThat()
		 .statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.time(lessThan(900l) )
		.body("body", Matchers.equalTo("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"))
		.body("id", Matchers.equalTo(2))
		.body("userId", Matchers.equalTo(1))
		.body("title", Matchers.equalTo("qui est esse"))
		.log().all();
	}
	
	@Test
	public void deleteReadTheDataFromServer() {
		
		 given().param("Content-Type", "application/json; charset=utf-8")
			.when().delete(domain+URI)
			.then().assertThat()
			 .statusCode(404)
			 .time(lessThan(600l) )
			 .contentType("")
			 .log().all();
	
			}
	

	

	
}
