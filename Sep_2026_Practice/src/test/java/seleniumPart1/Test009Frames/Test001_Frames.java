package seleniumPart1.Test009Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test001_Frames {
    public static void main(String[] args) {
        String url = "https://demo.automationtesting.in/Frames.html";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement frame1 = driver.findElement(By.cssSelector("#singleframe"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sameer");



    }
}
