package seleniumPart1.Test0013_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Test002 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement nameFieldElement = driver.findElement(By.id("name"));
        nameFieldElement.sendKeys("SameerBhai");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .perform();
        actions.keyDown(Keys.CONTROL)
                .sendKeys("C")
                .keyUp(Keys.CONTROL)
                .perform();
        actions.keyDown(Keys.TAB).perform();
        actions.keyUp(Keys.TAB).perform();

        actions.keyDown(Keys.CONTROL)
                .sendKeys("V")
                .keyUp(Keys.CONTROL)
                .perform();


    }
}
