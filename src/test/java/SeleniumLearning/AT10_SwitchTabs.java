package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AT10_SwitchTabs {
    @Test
    public void SwitchTabLearn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://www.thegoodguys.com.au/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click on E-Waste Recycle
        driver.findElement(By.id("FootereWaste")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //refresh page
        driver.navigate().refresh();
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //Get count of tabs
        int tabSize = tabs.size();
        System.out.println("tabs count : " + tabSize);
        for (int i = 0; i < tabSize; i++) {
            //switch to first tab
            driver.switchTo().window(tabs.get(i)); //it will switch to main tab
            break;
        }
    }
}
