package seleniumPart1.Test0022Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Test001 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        Set<Cookie> cookieSet = driver.manage().getCookies();
       for(Cookie cookie:cookieSet){
           System.out.println(cookie);
       }
        System.out.println(cookieSet.size());

       Cookie cookie =new Cookie("SameerCookie","Value");
       driver.manage().addCookie(cookie);
        Set<Cookie> cookieSet1 = driver.manage().getCookies();
        for(Cookie cookie1:cookieSet1){
            System.out.println(cookie1);
        }
        System.out.println(cookieSet1.size());




    }
}
