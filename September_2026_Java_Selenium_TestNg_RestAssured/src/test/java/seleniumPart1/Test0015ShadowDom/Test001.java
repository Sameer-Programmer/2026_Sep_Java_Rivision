package seleniumPart1.Test0015ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test001 {

    public static void main(String[] args) {

        String url = "https://shop.polymer-project.org/list/mens_outerwear";

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get(url);

        WebElement shopApp = driver.findElement(By.cssSelector("shop-app"));

        SearchContext root1 = shopApp.getShadowRoot();
        WebElement shopList = root1.findElement(By.cssSelector("shop-list"));
        SearchContext root2 = shopList.getShadowRoot();
        WebElement shopListItem = root2.findElement(By.cssSelector("shop-list-item"));
        SearchContext root3 = shopListItem.getShadowRoot();
        WebElement price = root3.findElement(By.cssSelector(".price"));

        System.out.println(price.getText());

        driver.quit();

        /*

        See Here He is attacking directly

        SearchContext root1 = driver.findElement(By.cssSelector("shop-app")).getShadowRoot();
        SearchContext root2 = root1.findElement(By.cssSelector("shop-list")).getShadowRoot();
        SearchContext root3 = root2.findElement(By.cssSelector("shop-list-item")).getShadowRoot();
        WebElement price = root3.findElement(By.cssSelector(".price"));

        System.out.println(price.getText());

        driver.quit();

         */



    }
}