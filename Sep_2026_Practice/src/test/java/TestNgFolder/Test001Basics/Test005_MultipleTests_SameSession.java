package TestNgFolder.Test001Basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test005_MultipleTests_SameSession {
    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    WebDriverWait wait;
    Alert alert;

    @Test(priority = 1)
    public void launchApp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test(priority = 2)
    public void verifyLogo() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement img = driver.findElement(By.cssSelector("[alt='company-branding']"));
        wait.until(ExpectedConditions.visibilityOf(img));
        boolean status = img.isDisplayed();
        System.out.println(status);
    }

    @Test(priority = 3)
    public void loginOperation() {
        driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }


    @Test(priority = 4)
    public void verifyLogin() {
        // driver.switchTo().alert().dismiss();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement img = driver.findElement(By.cssSelector("[alt='client brand banner']"));
        wait.until(ExpectedConditions.visibilityOf(img));
        boolean status = img.isDisplayed();
        System.out.println(status);
        //Assert.
    }


    @AfterTest()
    public  void quitbrowser(){
        driver.close();
        driver.quit();
    }

}
