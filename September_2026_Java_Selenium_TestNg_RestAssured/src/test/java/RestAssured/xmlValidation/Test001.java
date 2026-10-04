package RestAssured.xmlValidation;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class Test001 {
    String url = "https://www.w3schools.com/xml/simple.xml";

    @Test
    public void m1() {
        Response rs =
                given()
                        .header("User-Agent", "PostmanRuntime/7.0")
                        .header("Accept", "*/*").
                        when()
                        .get(url);
        System.out.println(rs.asPrettyString());
        int statusCode = rs.statusCode();
        System.out.println(statusCode);

        //Step 1
        //parse the Xml Data to extraxt the data
        //Parse means → read and understand structured data
        // so you can extract specific information from it.


        XmlPath xp = new XmlPath(rs.asPrettyString());
        String container = xp.getList("breakfast_menu").toString();
        Assert.assertTrue(container.contains("Strawberry"));

        //Sc-2
       List<String> names=  xp.getList("breakfast_menu.food.name");
       int indexOfBerryBerry= names.indexOf("Berry-Berry Belgian Waffles");
        System.out.println(indexOfBerryBerry);

        List<String> prices=  xp.getList("breakfast_menu.food.price");
        String priceBerryBerry = prices.get(indexOfBerryBerry);
        Assert.assertEquals(priceBerryBerry,"$8.95");

    }

}
