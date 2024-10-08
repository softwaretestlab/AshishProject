package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
    public class AT06_listofLinks {

        @Test
        public void linkList()  {
            //setting up chromedriver
            WebDriverManager.chromedriver().setup();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver();
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Navigate to HN website
            driver.get("https://www.thegoodguys.com.au");
            //implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //list of links
           List<WebElement> ListOfLinks=driver.findElements(By.tagName("a"));
            //count of links
            int LinksCount=ListOfLinks.size();
            System.out.println("LinksCount : "+LinksCount);
            //for loop
            for(int i=0;i<LinksCount;i++){
                // if a link has text then print to console
                String LinkName =ListOfLinks.get(i).getText();
                System.out.println("LinkName : "+ LinkName);
                if(LinkName.equalsIgnoreCase("Buying Guides")){
                    ListOfLinks.get(i).click();
                    break;
                }
            }

        }
        }

//       if (LinkName.equalsIgnoreCase("Buying Guides")){
//    // Thread.sleep(10000);
//    //  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ListOfLinks.get(i));
//    //      or
//    JavascriptExecutor executor2 = (JavascriptExecutor)driver;
//    //now click on the matched link
//                executor2.executeScript("arguments[0].click();", ListOfLinks.get(i));
//            break;
//            }
//

