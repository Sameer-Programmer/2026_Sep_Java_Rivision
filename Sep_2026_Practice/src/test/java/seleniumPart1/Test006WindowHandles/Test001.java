package seleniumPart1.Test006WindowHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test001 {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // set dont have the way of accessing the string from the index so we add into List to access from the index

        Set<String> windowIds=  driver.getWindowHandles();
        ArrayList<String> arrayList = new ArrayList<>(windowIds);
        System.out.println(arrayList.size());

        String parentID = arrayList.get(0);
        String childId = arrayList.get(1);

        System.out.println(parentID);
        System.out.println(childId);

       String parentWindowTitle =  driver.switchTo().window(parentID).getTitle();
        System.out.println(parentWindowTitle);


        driver.close();
        driver.quit();

    }
}
