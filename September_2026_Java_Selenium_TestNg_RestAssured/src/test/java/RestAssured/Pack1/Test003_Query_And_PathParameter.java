package RestAssured.Pack1;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test003_Query_And_PathParameter {
    //https://gorest.co.in/public/v2/users?id=8636024
    String url = "https://gorest.co.in/public/v2/";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";


    @Test
    public  void m1 (){
        Response rs =  given()
                .header("Authorization","Bearer "+token)
                .pathParams("key","users")
                .queryParam("id","8636024")
                .when()
                .get(url+"{key}");
        System.out.println(rs.asPrettyString());

    }
}
