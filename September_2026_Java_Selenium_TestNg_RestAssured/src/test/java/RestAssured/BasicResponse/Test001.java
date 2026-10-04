package RestAssured.BasicResponse;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class Test001 {

    @Test
    public void m1() {
        Response rs = given().
                when().get("https://gorest.co.in/public/v2/users");
        int responseCode = rs.statusCode();
        long responseTime =   rs.time(); //2000 ms = 2 seconds
        Headers headers = rs.headers();
        System.out.println(headers);
      String headerContentTypeValue =   rs.getHeader("Content-Type");
        System.out.println(headerContentTypeValue+"    headerContent");
Assert.assertTrue(headerContentTypeValue.contains("application/json; charset=utf-8"));
       Assert.assertTrue(
               rs.header("Content-Type").contains("application/json")
       );





        Assert.assertTrue(responseTime<=2000);
        Assert.assertEquals(200, responseCode);
    }


}
