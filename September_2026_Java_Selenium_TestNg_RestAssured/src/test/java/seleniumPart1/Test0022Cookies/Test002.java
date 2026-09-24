package seleniumPart1.Test0022Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Test002 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        Set<Cookie> cookieSet = driver.manage().getCookies();
       for(Cookie cookie:cookieSet){
           System.out.println(cookie.getName()+"   "+cookie.getValue());
       }
       driver.manage().deleteCookieNamed("OCSESSID");

        Set<Cookie> cookieSet2 = driver.manage().getCookies();
        System.out.println(cookieSet2.size());
        driver.manage().deleteAllCookies();






    }
}
