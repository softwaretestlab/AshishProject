package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class AT09_DropDownSelect {

    @Test
    public void iframeReg() throws InterruptedException {

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/hp-15-6-inch-i5-1155g7-8gb-256gb-ssd-laptop-natural-silver.html");
        //Wait few seconds for the page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //parent which are we are going to select
        // this parent will have children as dropdown items in this case this DropDownList will hold
        // all the dropdown items names
        Select DropDownList = new Select(driver.findElement(By.xpath("ProductCare_sf-select__JdgHs")));
        int DropDownSize= DropDownList.getOptions().size();
        System.out.println("DropDownSize : "+DropDownSize);
        //First Method
//        for(int i=0; i<DropDownSize;i++){
//            String TxtVal = DropDownList.getOptions().get(i).getText();
//            System.out.println("TxtVal :"+TxtVal);
//            if(TxtVal.equalsIgnoreCase("2 years Product Care Replace")){
//                DropDownList.getOptions().get(i).click();
//                break;
//            }

//        }
        //2nd method
        DropDownList.selectByVisibleText("2 years Product Care Replace");
        //3rd method -- this is hardcoding -- not recomended
        DropDownList.selectByIndex(3);

    }

}
