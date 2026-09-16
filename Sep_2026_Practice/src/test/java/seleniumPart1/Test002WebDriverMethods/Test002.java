package seleniumPart1.Test002WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test002 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String windowId = driver.getWindowHandle();
        System.out.println(windowId);

        Set<String> windowids = driver.getWindowHandles();
        ArrayList<String> list = new ArrayList(windowids);
        System.out.println(list.size());
        String parentid = list.get(0);
        System.out.println(parentid);


        driver.close();
    }
}
