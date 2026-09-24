package TestNgFolder.Test007ListnersAndReportgeneration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test003 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void testLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("img[alt='company-branding']")));
        Assert.assertTrue(logo.isDisplayed());
    }


    @Test(priority = 2)
    void testURL() {
        String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/loginn";
        Assert.assertEquals(driver.getCurrentUrl(), appUrl);
    }

    @Test(priority = 3, dependsOnMethods = {"testURL"})
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}

/*
<!--
   <listener class-name="TestNgFolder.Test007Listners.Test002_MyListner"></listener>
   -->
 */