package RestAssured.PAck4;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test001 {

    String url = "https://httpbin.org/post";
    String projectrootPath = System.getProperty("user.dir");
    String file1 = projectrootPath+"//Documents//Arrays.pdf";
    String file2 = projectrootPath+"//Documents//Strings.pdf";

    @Test
    public void files1(){

       Response rs =  given()
               .multiPart("file1",file1)
               .multiPart("file1",file2)
                .when().post(url);
       String output = rs.asPrettyString();
        System.out.println(output);
        Assert.assertTrue(output.contains("//Documents//Arrays.pdf"));


    }


}
