package RestAssured;

import io.restassured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test001_ValidateResponse {

    @Test
    public void m1(){
    Response rs =    given().
            when().get("https://gorest.co.in/public/v2/users");
    int responseCode = rs.statusCode();
        Assert.assertEquals(200,responseCode);
    }

    @Test
    public void m2(){
         given().
                when().get("https://gorest.co.in/public/v2/users")
                .then().log().all().statusCode(200);

    }
}
