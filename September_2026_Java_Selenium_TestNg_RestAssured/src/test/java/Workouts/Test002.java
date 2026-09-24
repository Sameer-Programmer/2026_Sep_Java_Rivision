package Workouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Test002 {
    public static void main(String[] args) throws IOException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);

      List<WebElement> list = driver.findElements(By.tagName("a"));
      int brokenCount =0;
      for(WebElement element:list){
        String hrefAttributeValue =  element.getAttribute("href");

        if(hrefAttributeValue==null || hrefAttributeValue.isEmpty()){
            continue;
        }
        URL url1 = new URL(hrefAttributeValue);
       HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
       httpURLConnection.connect();
       if(httpURLConnection.getResponseCode()>=400){
           System.out.println(hrefAttributeValue+"   "+httpURLConnection.getResponseCode());
           brokenCount++;
       }else {

       }

      }
        System.out.println(brokenCount);


    }
}

