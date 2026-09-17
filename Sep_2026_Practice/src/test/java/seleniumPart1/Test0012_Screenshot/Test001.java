package seleniumPart1.Test0012_Screenshot;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
TakeScrenshot is an Interface
so we have to do Upcasting when we refer webdriver reference to TakeScreenshot
 */


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Test001 {
    public static void main(String[] args) throws IOException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);

        TakesScreenshot ts = (TakesScreenshot) driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File des = new File("./Screenshots/HomePage.png");
        FileHandler.copy(src,des);


        WebElement table1 = driver.findElement(By.xpath("//h2[contains(text(),'Static Web Table')]"));
        File src1= table1.getScreenshotAs(OutputType.FILE);
        File des1 = new File("./Screenshots/HomePage2.png");
        FileHandler.copy(src1,des1);

    }
}
