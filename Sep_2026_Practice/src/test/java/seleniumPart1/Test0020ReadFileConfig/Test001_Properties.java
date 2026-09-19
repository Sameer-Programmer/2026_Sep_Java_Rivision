package seleniumPart1.Test0020ReadFileConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Test001_Properties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String projectpath = System.getProperty("user.dir");
        String filepath1 = projectpath+"//Documents//config.properties";
        FileInputStream fis = new FileInputStream(filepath1);
        properties.load(fis);

        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");
        if( browser.equalsIgnoreCase("chrome")){
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.manage().window().maximize();
            driver.get(url);
            System.out.println(driver.getTitle());
        }

    }
}
