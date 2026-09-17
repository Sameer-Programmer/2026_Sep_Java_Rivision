package seleniumPart1.Test009Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test002_Frames {
    public static void main(String[] args) {
        String url = "https://demo.automationtesting.in/Frames.html";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement tab2 = driver.findElement(By.xpath("//a[@href='#Multiple'][@data-toggle='tab']"));
        tab2.click();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sameer");
        driver.switchTo().defaultContent();
        driver.close();


    }
}
