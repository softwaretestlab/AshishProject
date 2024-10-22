package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class OpenBrowser {
    public static WebDriver driver;

    public static void NavToWeb(String url){
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        // selenium code runs in background
        //chromeOptions.addArguments("--headless");
        //no history storing mode
        chromeOptions.addArguments("--incognito");
        //we create an object of WebDriver
        driver = new ChromeDriver(chromeOptions);
        //Navigate to HN website
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          }
}
