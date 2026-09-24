package ThreadLocalConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test001 {

    WebDriver driver;

    @Test
    public void  m1(){
        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void  m2(){
        driver =new EdgeDriver();
        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(Thread.currentThread().getId());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }








}
