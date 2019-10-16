package Sample;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Twitter_Search {

	String Consumerkey = "lCiPRO4nEK6xi2joi0uW30RSV";
	String ConsumerSecretkey = "UP3FMMuahNYD3sJ7sAdPvu4LfKcwWOSpZDNEmJ8CT9K1uTIxZQ";
	String Token = "852810423300521984-hjWUsf104UJB9FKgtPsl50aZNqTpY64";
	String TokenSecretkey = "HTJNcSkZWp8hlFueDlKDyH1ZyVfrJyImyQw7KnP8AKpXK";
	
	@Test
	public void searchtweet()
	{
		RestAssured.baseURI="https://api.twitter.com/1.1";
		Response res=given().auth().oauth(Consumerkey, ConsumerSecretkey, Token, TokenSecretkey).
		queryParam("q","#Qualitest").
		when().get("search/tweets.json").then().extract().response();
		String responce=res.asString();
		System.out.println(responce);
		
		
	
		
	
}
}