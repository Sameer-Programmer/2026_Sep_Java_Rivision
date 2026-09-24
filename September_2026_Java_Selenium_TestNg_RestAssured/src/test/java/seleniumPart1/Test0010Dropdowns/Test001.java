package seleniumPart1.Test0010Dropdowns;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement countryDpdn = driver.findElement(By.cssSelector("#country"));
        Select select = new Select(countryDpdn);
        select.selectByVisibleText("France");
        select.selectByValue("germany");
        select.selectByIndex(0);

       List<WebElement> options = driver.findElements(By.xpath("//select[@id='country']/option"));
        ArrayList<String>list1 = new ArrayList<>();

       for(WebElement option:options){
           String value = option.getText();
           System.out.println(value);
           if(value.equalsIgnoreCase("China")){
               Assert.assertTrue(true);
               break;
           }
           list1.add(value);
       }
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
