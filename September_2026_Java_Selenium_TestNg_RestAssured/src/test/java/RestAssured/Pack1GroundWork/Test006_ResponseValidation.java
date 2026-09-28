package RestAssured.Pack1GroundWork;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Test006_ResponseValidation {

    int generatedId;
    String url = "https://gorest.co.in/public/v2/users";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String gender = "male";
    String email = faker.internet().emailAddress();
    String status = "inactive";

    public HashMap<String, String> TestDat() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", name);
        hm.put("gender", gender);
        hm.put("email", email);
        hm.put("status", status);
        return hm;
    }


    @Test
    public void m1() {
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(TestDat()).
                when()
                .post(url);
        int responseStatusCode = rs.getStatusCode();
        System.out.println(responseStatusCode);
        Assert.assertEquals(responseStatusCode,201);
        System.out.println(rs.asPrettyString());


         generatedId =rs.jsonPath().getInt("id");
        System.out.println(generatedId);

    }



@Test(dependsOnMethods = {"m1"})
    public  void m2(){
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when()
                .get("https://gorest.co.in/public/v2/users");

    int responseid = rs.jsonPath()
            .getInt("find { it.id == " + generatedId + " }.id");
    String  responsename =
            rs.jsonPath().getString("find { it.id == " + generatedId + " }.name");
    Assert.assertEquals(responseid,generatedId);
    Assert.assertEquals(responsename,name);
    System.out.println(rs.asPrettyString());

   

    }


}


