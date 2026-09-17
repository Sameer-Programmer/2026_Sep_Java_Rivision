package seleniumPart1.Test0014FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        String filepath = System.getProperty("user.dir");
        WebElement elementChooseFile = driver.findElement(By.cssSelector("#singleFileInput"));
        elementChooseFile.sendKeys(filepath + "//Documents//Strings.pdf");

        WebElement elementChooseFile2 = driver.findElement(By.cssSelector("#multipleFilesInput"));
        String p1 = filepath + "//Documents//Strings.pdf";
        String p2 = filepath + "//Documents//Arrays.pdf";
        elementChooseFile2.sendKeys(p1+"\n"+p2);


    }
}
