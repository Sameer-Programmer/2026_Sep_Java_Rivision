package seleniumPart1.Test0015ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test002 {

    public static void main(String[] args) {

        String url = "https://shop.polymer-project.org/list/mens_outerwear";

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get(url);

        WebElement shopappElement = driver.findElement(By.cssSelector("shop-app"));
        SearchContext root1 = shopappElement.getShadowRoot();

        WebElement ironPages = root1.findElement(By.cssSelector("iron-pages"));
        WebElement shopList =    ironPages.findElement(By.cssSelector("shop-list[name='list']"));


        SearchContext root2 =   shopList.findElement(By.cssSelector("a>shop-list-item")).getShadowRoot();
        String content = root2.findElement(By.cssSelector("span[class='price'] ")).getText();
        System.out.println(content);


        driver.quit();
    }
}