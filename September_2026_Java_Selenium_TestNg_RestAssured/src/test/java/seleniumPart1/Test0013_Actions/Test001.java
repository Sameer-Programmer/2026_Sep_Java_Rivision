package seleniumPart1.Test0013_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement e1 = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));

        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",e1);

        Actions actions = new Actions(driver);
        actions.moveToElement(e1).build().perform();  // moved
        actions.moveToElement(e1).click().perform(); // clicked
        actions.contextClick(e1).perform();


        WebElement source1 = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement des1 = driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
        actions.dragAndDrop(source1,des1).perform();


    }
}
