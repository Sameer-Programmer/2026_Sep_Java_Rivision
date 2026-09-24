package seleniumPart1.Test0015ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test007 {
    public static void main(String[] args) {
        String url = "https://dev.automationtesting.in/shadow-dom";

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get(url);

        SearchContext root1 =driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext  root2 =  root1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        String content = root2.findElement(By.cssSelector("span[id='nested-shadow-element']")).getText();

        System.out.println(content);
    }
}
