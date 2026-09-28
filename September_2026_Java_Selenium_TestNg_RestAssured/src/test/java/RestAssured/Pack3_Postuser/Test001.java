package RestAssured.Pack3_Postuser;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test001 {

    String url = "https://gorest.co.in/public/v2/users";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

    @Test
    public void m1(ITestContext context) {
        Faker faker = new Faker();
        String name = faker.name().name();
        String gender = "male";
        String email = faker.internet().emailAddress();
        String status = "active";

        JsonObject jo = new JsonObject();
        jo.addProperty("name", name);
        jo.addProperty("gender", gender);
        jo.addProperty("email", email);
        jo.addProperty("status", status);

        Response rs
                = given().header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(jo.toString())
                .when().post(url);
        int statusCode = rs.statusCode();
        Assert.assertEquals(statusCode, 201);
        int id = rs.jsonPath().getInt("id");
        context.setAttribute("key", id);
    }

    @Test(dependsOnMethods = {"m1"})
    public void getResponseById(ITestContext context) {
        int id = (Integer) context.getAttribute("key");
        String url2 = "https://gorest.co.in/public/v2/users/" + id;
        System.out.println(url2);

        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when().get(url2);
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.statusCode(), 200);
    }
}
