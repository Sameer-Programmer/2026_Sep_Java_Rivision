package seleniumPart1.Test0017DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement datepicker2
                = driver.findElement(By.cssSelector("input[id='txtDate']"));
        datepicker2.click();
        WebElement monthElement
                 = driver.findElement(By.cssSelector(".ui-datepicker-month"));
        Select select = new Select(monthElement);
        select.selectByVisibleText("Jan");
        //
        WebElement yearElement
                = driver.findElement(By.cssSelector(".ui-datepicker-year"));
        Select select2 = new Select(yearElement);
        select2.selectByValue("2027");

        String targetValue = "29";

        WebElement targetElement
                = driver.findElement(By.xpath("//a[contains(normalize-space(),'"+targetValue+"')]"));
        targetElement.click();

    }
}
