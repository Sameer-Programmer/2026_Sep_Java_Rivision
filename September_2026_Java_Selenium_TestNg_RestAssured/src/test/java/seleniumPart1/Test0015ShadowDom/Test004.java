package seleniumPart1.Test0015ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test004 {
    public static void main(String[] args) {
        String url = "https://shop.polymer-project.org/list/mens_outerwear";

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get(url);
        SearchContext root1  =   driver.findElement(By.cssSelector("shop-app")).getShadowRoot();
        WebElement ironPages =  root1.findElement(By.cssSelector("iron-pages"));
        SearchContext root2 = ironPages.findElement(By.cssSelector("shop-list")).getShadowRoot();
        SearchContext root3 = root2.findElement(By.cssSelector("a>shop-list-item")).getShadowRoot();
        String price =  root3.findElement(By.cssSelector(".price")).getText();
        System.out.println(price);


    }
}

//One formula is where ever we are entering directly there we are using
//SearchContext root1  = --- .getShadowRoot();