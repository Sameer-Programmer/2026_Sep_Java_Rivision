package seleniumPart1.Test007Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@for='days']/following::input[@class='form-check-input']"));
        for(WebElement checkbox:checkboxes){
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected(),"Checkbox Not Selected");
        }
        driver.close();
        driver.quit();
    }
}
