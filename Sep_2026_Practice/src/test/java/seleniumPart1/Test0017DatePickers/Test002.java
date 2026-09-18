package seleniumPart1.Test0017DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Test002 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement datepicker2
                = driver.findElement(By.cssSelector("input[id='txtDate']"));
        datepicker2.click();

        String targetYear = "2027";
        String targetMonth = "Jan";//Jan


        while(true){
            WebElement monthElement = driver.findElement(By.cssSelector(".ui-datepicker-month"));
            WebElement yearElement = driver.findElement(By.cssSelector(".ui-datepicker-year"));

            Select select1 = new Select(monthElement);
            String currentMonthElementText =  select1.getFirstSelectedOption().getText();

            Select select2 = new Select(yearElement);
            String currentYearElementText =select2.getFirstSelectedOption().getText();

            WebElement nextButton = driver.findElement(By.cssSelector("a[title='Next']"));

            if(currentMonthElementText.equalsIgnoreCase(targetMonth) && currentYearElementText.equalsIgnoreCase(targetYear) ){
                break;
            }else {
                nextButton.click();
            }

        }

        String targetValue = "29";

        WebElement targetElement
                = driver.findElement(By.xpath("//a[contains(normalize-space(),'"+targetValue+"')]"));
        targetElement.click();






    }
}
