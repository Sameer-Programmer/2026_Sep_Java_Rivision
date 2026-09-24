package RestAssured.Pack1;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Test002_Post {

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

  //  Test002_Post ts = new Test002_Post();

    int id;

    @Test
    public void m1() {
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(TestDat()).
                when()
                .post(url);
        System.out.println(rs.statusCode());
     //   System.out.println(rs.asPrettyString());
        System.out.println(rs.asString());
        String s = rs.asString();
        System.out.println(s.length());

        System.out.println("Json Path");
        System.out.println(rs.jsonPath());

        JsonPath jp = rs.jsonPath();
         id = jp.getInt("id");
        System.out.println(id);
        Assert.assertEquals(rs.statusCode(),201);


    }

    @Test(dependsOnMethods = {"m1"})
    public void getResponseById(){
        String url2 = "https://gorest.co.in/public/v2/users/"+id;
        System.out.println(url2);

        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when().get(url2);
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.statusCode(),200);

    }


}
