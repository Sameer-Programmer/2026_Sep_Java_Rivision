package RestAssured.Pack1GroundWork;

import static io.restassured.RestAssured.*;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.Test;

import java.util.Map;


public class Test001_ValidateResponse {

    @Test
    public void m1() {
        Response rs = given().
                when().get("https://gorest.co.in/public/v2/users");
        int responseCode = rs.statusCode();
        long responseTime =   rs.time(); //2000 ms = 2 seconds


        Assert.assertTrue(responseTime<=2000);
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void m2() {
        given().
                when().get("https://gorest.co.in/public/v2/users")
                .then().log().all().statusCode(200);

    }
}
