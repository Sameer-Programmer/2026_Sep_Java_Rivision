package RestAssured.Pack1GroundWork;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test004_CaptureCookies {

    @Test
    public void m1() {
        Response rs = given().
                when().get("https://www.google.com/");
        Map<String, String> hm = rs.getCookies();

        System.out.println(hm.size());
        for (Object k : hm.keySet()) {
            System.out.println(k + "  :   " + hm.get(k));
        }
        System.out.println(hm.get("AEC")); // Printing by only key

        // one more way is
        System.out.println(rs.getCookie("AEC"));

        // Add a Cookie


    }

// adding a Cookie as Request
    @Test
    public void m2() {
        Response rs = given().
                cookie("username", "sameer").
                when().get("https://www.google.com/");
        Map<String, String> hm = rs.getCookies();


        System.out.println(hm.size());
        for (Object k : hm.keySet()) {
            System.out.println(k + "  :   " + hm.get(k));
        }


    }


}
