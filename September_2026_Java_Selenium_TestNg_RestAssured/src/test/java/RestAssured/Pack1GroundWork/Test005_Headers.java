package RestAssured.Pack1GroundWork;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test005_Headers {

    @Test
    public void m1() {
        Response rs = given().
                cookie("username", "sameer").
                when().get("https://www.google.com/");
        Headers hs = rs.getHeaders();
        String value = rs.getHeader("Content-Type");
        System.out.println(value);
        System.out.println(hs.size());
        for (Header header : hs) {
            System.out.println(header.getName() + ":" + header.getValue());
        }

        Assert.assertEquals(value,"text/html; charset=ISO-8859-1");
    }

}


