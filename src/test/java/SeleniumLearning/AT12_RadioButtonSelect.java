package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class AT12_RadioButtonSelect {

    @Test
    public void NavHn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        List<WebElement>  RadioButtonList =  driver.findElements(By.cssSelector("input[name='radio1']"));
        int RadioSize =RadioButtonList.size();
        System.out.println("RadioSize : " + RadioSize); //3
// here we are implementing selenium concepts isDisplayed,isSelected and also clicking on
        //first radio button
//        for(int i=0;i<RadioSize;i++){
//            //isDisplayed(); bollean -- true or false
//           boolean RadioBtnDisplayed = RadioButtonList.get(i).isDisplayed();
//            System.out.println("RadioBtnDisplayed : " + RadioBtnDisplayed); //true
//            //isSelected
//            boolean RadioBtnSelect =RadioButtonList.get(i).isSelected();
//            System.out.println("Is RadioBtnSelect selected ? : " + RadioBtnSelect); //false
//            if(RadioBtnSelect==false){
//                RadioButtonList.get(i).click();
//                break;
//            }
//        }

        // here we are getting attribute value and also clicking on first radio button
        for(int i=0;i<RadioSize;i++){
            // this is how we get attribute values
            //type="radio"
            String Attval=RadioButtonList.get(i).getAttribute("type");
            RadioButtonList.get(i).click();
            break;
        }

    }

}
