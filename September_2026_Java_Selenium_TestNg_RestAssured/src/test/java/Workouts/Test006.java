package Workouts;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test006 {


    @Test
    public void m1(){
       Response rs =  given().when().get("https://www.google.com/");
       Map<String,String> hm =rs.getCookies();
      //  System.out.println(hm);

        for(String cookie : hm.keySet()){
          //  System.out.println(cookie+"  "+hm.get(cookie));
        }
        System.out.println(hm.get("AEC"));
    }

}
