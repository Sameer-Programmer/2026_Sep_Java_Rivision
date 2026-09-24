package seleniumPart1.Test001Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test002_SeleniumLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.printf(driver.getTitle());

    }
}
