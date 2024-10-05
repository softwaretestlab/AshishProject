package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AT04_QuitvsClose {
    @Test
    public void QvsC() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.myer.com.au/join");
        Thread.sleep(10000);
        //this below command will close the browser
        // driver.close();
        //this below command will quit driver meaning both chromedriver and browser are closed
        driver.quit();
    }
}