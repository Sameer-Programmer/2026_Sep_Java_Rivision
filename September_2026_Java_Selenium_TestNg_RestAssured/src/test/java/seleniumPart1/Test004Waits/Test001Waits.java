package seleniumPart1.Test004Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;


import java.time.Duration;

public class Test001Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // implicit wait - Global
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Data Entry Form']")));
        WebElement nameElement = driver.findElement(By.cssSelector("#name"));
        nameElement.sendKeys("Sameer Doing Automation");

        System.out.println("success");

        //Thread.sleep(10000);


        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement emailElement = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));
        emailElement.sendKeys("sameeridea7@gmail.com");


//        driver.close();
//        driver.quit();


    }
}
