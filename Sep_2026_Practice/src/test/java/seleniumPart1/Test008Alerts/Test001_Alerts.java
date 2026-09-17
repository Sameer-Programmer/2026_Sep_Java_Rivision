package seleniumPart1.Test008Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Test001_Alerts {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement sampleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));

        sampleAlert.click();
        Alert alert = driver.switchTo().alert();
        String message1 = alert.getText();
        System.out.println(message1);
        Assert.assertEquals("I am an alert box!",message1);
        alert.accept();

        Thread.sleep(5000);

        confirmationAlert.click();
        Thread.sleep(5000);
        alert.dismiss();
        promptAlert.click();
        alert.sendKeys("Sameer");
        Thread.sleep(5000);
        System.out.println(alert.getText());
        alert.accept();

        driver.close();


    }
}
