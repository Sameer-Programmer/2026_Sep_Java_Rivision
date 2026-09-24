package seleniumPart1.Test008Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test002_AuthAlerts {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.linkText("Basic Auth")).click();
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
    }
}
