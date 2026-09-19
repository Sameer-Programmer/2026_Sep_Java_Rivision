package Workouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

public class Test003 {
    public static void main(String[] args) {
        String downloadPath = System.getProperty("user.dir");
        HashMap<String,Object>preferences = new HashMap<>();
        preferences.put("download.default_directory", downloadPath);
        preferences.put("download.prompt_for_download", false);
        preferences.put("download.directory_upgrade", true);
        preferences.put("plugins.always_open_pdf_externally", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);
        WebDriver driver = new ChromeDriver(options);
       driver.get("http://localhost:8080/");
       File file = new File(downloadPath+"//PurchaseReport.pdf");
       if(file.exists()){
           file.delete();
           System.out.println("file deleted");
       }
       driver.findElement(By.cssSelector("#downloadPdf")).click();
       Wait<WebDriver> wait = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(30))
               .pollingEvery(Duration.ofSeconds(2));

        Assert.assertTrue(wait.until(d->file.exists()));
        driver.quit();


    }
}
