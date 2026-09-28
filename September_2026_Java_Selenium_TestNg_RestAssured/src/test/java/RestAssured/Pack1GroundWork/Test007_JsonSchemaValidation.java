package RestAssured.Pack1GroundWork;

import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test007_JsonSchemaValidation {


    String url = "https://gorest.co.in/public/v2/users";
    @Test
    public void m1(){
        Response rs = given().when().get(url);
        rs.then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("File1.json"));

    }











}
