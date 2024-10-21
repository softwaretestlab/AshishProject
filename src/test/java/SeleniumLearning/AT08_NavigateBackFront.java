package SeleniumLearning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

    public class AT08_NavigateBackFront {
        @Test
        public void NavToFro() throws InterruptedException {
            //setting up chromedriver
            WebDriverManager.chromedriver().setup();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver();
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            //Navigate to HN website
            driver.get("https://echoecho.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//big/a[contains(text(),'Tutorials')]")).click();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            driver.navigate().forward();



        }
}
