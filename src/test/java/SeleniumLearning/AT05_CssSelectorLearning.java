package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AT05_CssSelectorLearning {

    @Test
    public void cssLearn() throws InterruptedException {

        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");

        //CSS version-1 for id
        driver.findElement(By.cssSelector("#regAddForm_firstName")).sendKeys("MyFirstName");
        //starts-with
        driver.findElement(By.cssSelector("input[name^='las']")).sendKeys("MyLastName");
        //CSS version-2 for attribute value
        driver.findElement(By.cssSelector("[name='email1']")).sendKeys("firstnamelastname@gmail.com");
        //for id only, you can use tag and id value
        driver.findElement(By.cssSelector("input#regAddForm_password")).sendKeys("password");
        //click on checkbox
        Thread.sleep(5000);
        // when you get this below error message then use javascript executor
        //ElementClickInterceptedException: element click intercepted: Element is not clickable at point (320, 1395)
        //click checkbox
        WebElement elementCheckBox = driver.findElement(By.cssSelector("#regAddForm_terms"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", elementCheckBox);

        //click submit button
        WebElement elementButton = driver.findElement(By.cssSelector("button#WC_UserRegistrationAddForm_links_1"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", elementButton);

    }

}

