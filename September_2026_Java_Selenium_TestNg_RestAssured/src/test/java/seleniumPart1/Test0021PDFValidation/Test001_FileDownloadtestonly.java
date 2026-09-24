package seleniumPart1.Test0021PDFValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Test001_FileDownloadtestonly {
    public static void main(String[] args) throws InterruptedException {
        String downloadPath = System.getProperty("user.dir") + "\\Downloads";
        // Chrome download preferences
        Map<String, Object> preferences = new HashMap<>();
        preferences.put("download.default_directory", downloadPath);
        preferences.put("download.prompt_for_download", false);
        preferences.put("download.directory_upgrade", true);
        // Open PDF externally instead of Chrome PDF viewer
        preferences.put("plugins.always_open_pdf_externally", true);
        // Chrome options
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);

        // Launch browser
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080");
        // Expected PDF location
        File pdfFile = new File(downloadPath + "\\PurchaseReport.pdf");
        // Delete old PDF if it already exists
        if (pdfFile.exists()) {
            System.out.println("Old PurchaseReport.pdf found. Deleting it...");
            pdfFile.delete();
        }
        // Click Download PDF
        driver.findElement(By.id("downloadPdf")).click();
        System.out.println("Download button clicked");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1));

        wait.until(d -> pdfFile.exists());

        Assert.assertTrue(pdfFile.exists(), "PDF file was not downloaded");
        System.out.println("Done");

    }
}
