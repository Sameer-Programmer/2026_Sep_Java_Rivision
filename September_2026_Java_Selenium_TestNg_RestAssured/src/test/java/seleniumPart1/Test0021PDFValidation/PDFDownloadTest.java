package seleniumPart1.Test0021PDFValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class PDFDownloadTest {

    public static void main(String[] args) throws Exception {

        // Download folder
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
        try {

            // Open our local application
            driver.get("http://localhost:8080");
            // Click Download PDF
            driver.findElement(By.id("downloadPdf")).click();
            System.out.println("Download button clicked");

            // Expected PDF location
            File pdfFile = new File(downloadPath + "\\PurchaseReport.pdf");

            // Wait for PDF download
            int timeout = 30;
            while (timeout > 0) {
                if (pdfFile.exists()) {
                    break;
                }
                Thread.sleep(1000);
                timeout--;
            }
            // Validate PDF download
            Assert.assertTrue(pdfFile.exists(), "PDF was not downloaded");
            System.out.println("PDF downloaded successfully!");
            System.out.println("PDF Location: " + pdfFile.getAbsolutePath());

            // =========================================
            // PDF VALIDATION USING PDFBOX
            // =========================================

            // Open PDF
            PDDocument document = Loader.loadPDF(pdfFile);
            System.out.println("PDF opened successfully!");


            // Get number of pages
            int pageCount = document.getNumberOfPages();
            System.out.println("Number of pages: " + pageCount);


            // Validate page count
            Assert.assertTrue(pageCount > 0, "PDF does not contain any pages");


            // Extract text from PDF
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            String pdfText = pdfTextStripper.getText(document);


            // Print PDF content
            System.out.println("========== PDF CONTENT ==========");
            System.out.println(pdfText);
            System.out.println("=================================");
            //assertions// Validate PDF data
            Assert.assertTrue(pdfText.contains("Purchase Report"), "Purchase Report title not found");
            Assert.assertTrue(pdfText.contains("Selenium"), "Selenium book not found");
            Assert.assertTrue(pdfText.contains("29-Jul-2019"), "Purchased date not found");
            Assert.assertTrue(pdfText.contains("350"), "Amount 350 not found");
            Assert.assertTrue(pdfText.contains("Africa"), "Location Africa not found");
            Assert.assertTrue(pdfText.contains("Java"), "Java book not found");
            Assert.assertTrue(pdfText.contains("450"), "Amount 450 not found");
            Assert.assertTrue(pdfText.contains("India"), "Location India not found");
            Assert.assertTrue(pdfText.contains("Python"), "Python book not found");
            Assert.assertTrue(pdfText.contains("500"), "Amount 500 not found");
            Assert.assertTrue(pdfText.contains("USA"), "Location USA not found");

            System.out.println("PDF data validation passed successfully!");

            // Close PDF
            document.close();

        } finally {

            driver.quit();
        }
    }
}