package TestNgFolder.Test004Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test003 {

    @Test(dataProvider = "Dp1_EUC",dataProviderClass = Test002.class)
    public void m1(String email,String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        Assert.assertTrue(status,"My AccountNot Visible");
    }

}
