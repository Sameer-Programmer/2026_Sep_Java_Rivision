package Workouts;

import static io.restassured.RestAssured.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Test008 {
    String url = "https://gorest.co.in/public/v2/users";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";


    @Test
    public void m1(ITestContext context) {
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when().get(url);
      String r1 =  rs.asPrettyString();
   //   Assert.assertTrue(r1.contains("chapala_jxain@goyette.example"),"Not FOund");

     String requiredvalue = "Vimal Dwivedi PhD";
        int extractedId = rs.jsonPath().getInt("find{it.name=='"+requiredvalue+"'}.id");
        System.out.println(extractedId);
       context.setAttribute("extractedId",extractedId);
    }

    @Test(dependsOnMethods = "m1")
    public void m2(ITestContext context) {
      int extractedId = (int) context.getAttribute("extractedId");
        String url2 = "https://gorest.co.in/public/v2/users/"+extractedId;
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when().get(url2);
        System.out.println(rs.asPrettyString());

    }



}
