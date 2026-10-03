package Workouts;

import static io.restassured.RestAssured.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Test005 {
    String url = "https://gorest.co.in/public/v2/users";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

    @Test
    public void m1() {
        Response rs = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when().get(url);
        System.out.println(rs.asPrettyString());
        JsonPath jp = rs.jsonPath();
        int code = rs.getStatusCode();
        Assert.assertEquals(code, 200);

        String jsonPathName = "find{it.id ==8646418}.name"; // jsonQuery Path
        String responseNameUnderResponseId = jp.getString(jsonPathName);
        System.out.println(responseNameUnderResponseId);
        Assert.assertEquals(responseNameUnderResponseId, "Bhuvanesh Khatri");

        //Headers
//        System.out.println("************Headers*************************");
//        Headers hs = rs.getHeaders();
//        for(Header hr :hs){
//            System.out.println(hr.getName()+"  :  "+hr.getValue());
//        }

        String headerResponse = rs.getHeader("Content-Type");
        System.out.println(headerResponse);
        Map<String, String> hm = rs.getCookies();
        System.out.println(hm);

    }


}
