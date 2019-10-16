package Sample;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class Re_Tweet {
	String Consumerkey = "lCiPRO4nEK6xi2joi0uW30RSV";
	String ConsumerSecretkey = "UP3FMMuahNYD3sJ7sAdPvu4LfKcwWOSpZDNEmJ8CT9K1uTIxZQ";
	String Token = "852810423300521984-hjWUsf104UJB9FKgtPsl50aZNqTpY64";
	String TokenSecretkey = "HTJNcSkZWp8hlFueDlKDyH1ZyVfrJyImyQw7KnP8AKpXK";
        
        @Test
        public void tweet() 
        {
            RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
            Response res= given().auth().oauth(Consumerkey, ConsumerSecretkey, Token, TokenSecretkey).
            when().get("home_timeline.json").then().extract().response();
            String str=res.asString();
            System.out.println(str);
            JsonPath js=new JsonPath(str);
            String text=js.get("text").toString();
            System.out.println(text);
            }
    }
 







