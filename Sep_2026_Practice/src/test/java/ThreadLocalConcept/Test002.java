package ThreadLocalConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test002 {



    private  static ThreadLocal<WebDriver>tdiver = new ThreadLocal<>();
    public void setDriver(WebDriver driver){
        tdiver.set(driver);
    }

    public WebDriver getDriver(){
        return tdiver.get();
    }

    WebDriver driver;

    @Test
    public void  m1(){
        driver =new ChromeDriver();
        setDriver(driver);
        getDriver().navigate().to("https://www.google.com/");
        System.out.println(getDriver().getTitle());
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void  m2(){
        driver =new ChromeDriver();
        setDriver(driver);
        getDriver().navigate().to("https://www.facebook.com/");
        System.out.println(getDriver().getTitle());
        System.out.println(Thread.currentThread().getId());
    }



    @AfterClass
    public void tearDown(){
        tdiver.remove();
        driver.quit();
    }








}
