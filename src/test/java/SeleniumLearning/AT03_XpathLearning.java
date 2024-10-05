package SeleniumLearning;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class AT03_XpathLearning {
    @Test
    public void xpath() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.myer.com.au/join");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //enter email address
        //xpath version-1 -- here we rightclicked and copied xpath
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
        //xpath version-2
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        //version -3
        //enter password
        driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys("password");
        Thread.sleep(10000);
        //version - 4
        //scroll to the element
        //String MyName = "john";
       // driver.findElement(By.xpath("//button[@id='create-account']")).click();
        WebElement  CreateAccEle =driver.findElement(By.xpath("//button[@id='create-account']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccEle);
        //click on create an account button
        CreateAccEle.click();

    }

}
