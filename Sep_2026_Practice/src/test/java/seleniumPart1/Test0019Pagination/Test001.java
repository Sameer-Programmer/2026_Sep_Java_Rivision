package seleniumPart1.Test0019Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement e1 = driver.findElement(By.cssSelector("#productTable"));
        js.executeScript("arguments[0].scrollIntoView()",e1);

        List<WebElement> rowElements=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
        int rows = rowElements.size();
        ////table[@id='productTable']//tr[1]//td[4]

        for(int i = 1; i<rows;i++){
            WebElement checkbox
                    = driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td/input[@type='checkbox']"));
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected());
        }

    }
}
