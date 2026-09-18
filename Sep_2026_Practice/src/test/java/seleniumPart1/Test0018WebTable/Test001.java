package seleniumPart1.Test0018WebTable;

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
        WebElement e1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr"));
        js.executeScript("arguments[0].scrollIntoView()",e1);

        List<WebElement> rowElements  = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int rows =  rowElements.size() ;
        System.out.println(rows);

        List<WebElement> list  = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//th"));
        int columns =  list.size() ;
        System.out.println(columns);

        int indexofAuther = 0;
        for(int i = 0; i<columns; i++){
          String value =   list.get(i).getText();
            System.out.println(value);
            if(value.equalsIgnoreCase("Author")){
                indexofAuther = i +1; // because xpath starts with 1 not with 0
            }
        }
        System.out.println(indexofAuther);



        for(int i = 2; i<rows;i++){
            String bookname
                    = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
            if(bookname.equalsIgnoreCase("Learn Java")){
                String authname
                        = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+indexofAuther+"]")).getText();
                if(authname.equalsIgnoreCase("Mukesh")){
                    Assert.assertTrue(true);
                    System.out.println("succ");
                    break;
                }
            }
        }



    }
}
