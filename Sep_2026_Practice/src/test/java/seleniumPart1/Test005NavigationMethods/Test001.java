package seleniumPart1.Test005NavigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java .net.URL;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // implicit wait - Global
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        URL url = new URL("https://demowebshop.tricentis.com/");
        driver.navigate().to(url);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
    }
}
/*
Automation Testing Practice
Demo Web Shop
Automation Testing Practice
Demo Web Shop
Demo Web Shop
 */