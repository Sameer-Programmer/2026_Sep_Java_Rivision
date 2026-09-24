package TestNgFolder.Test005DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test001 {


    @DataProvider(name="Dp1")
    public String[][] getinfo(){
        String data[][] = {
                {"sameeridea7@gmai.com", "Sam123#"},
                {"prapoubucowou-8216@yopmail.com", "Sameera105@"},
        };
        return data;
    }

   @Test(dataProvider = "Dp1")
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
