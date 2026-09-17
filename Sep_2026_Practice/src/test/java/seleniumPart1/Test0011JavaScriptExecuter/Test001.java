package seleniumPart1.Test0011JavaScriptExecuter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        WebElement table1 = driver.findElement(By.xpath("//h2[contains(text(),'Static Web Table')]"));
        js.executeScript("arguments[0].scrollIntoView()",table1);

        WebElement sampleAlert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
        js.executeScript("arguments[0].scrollIntoView()",sampleAlert);
        js.executeScript("arguments[0].click()",sampleAlert);



    }
}
