package seleniumPart1.Test003ConditionalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        boolean b = driver.findElement(By.xpath("//label[@for='male']")).isDisplayed();
        System.out.println(b);
        if (b) {
            WebElement radiobuttonMale = driver.findElement(By.xpath("//input[@class='form-check-input'][@id='male']"));
            radiobuttonMale.click();
            System.out.println(radiobuttonMale.isSelected());
        }
        WebElement name = driver.findElement(By.cssSelector("#name"));
        System.out.println(name.isEnabled());


        driver.close();
        driver.quit();

    }
}
