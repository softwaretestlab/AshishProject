package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Xls_Reader;

import java.io.IOException;

public class AT20_ExcelDataUsage extends OpenBrowser {

    @Test
    public void CreateAccounts() throws IOException, IOException {
       OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGCrtAcc"));
        Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
        // count of rows in the excel sheet
        int rowcount = reader.getRowCount("RegTestData");
        System.out.println("rowcount :" + rowcount);
        for (int i = 2; i <= rowcount; i++) {
            //FirstName
            String FristName=reader.getCellData("RegTestData","FirstName",i);
            driver.findElement(By.id("regAddForm_firstName")).clear();
            driver.findElement(By.id("regAddForm_firstName")).sendKeys(FristName);
            //Here we picked up data for LastName from excel
            String lastname=reader.getCellData("RegTestData","LastName",i);
            driver.findElement(By.id("regAddForm_lastName")).clear();
            driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",i);
            driver.findElement(By.id("regAddForm_email1")).clear();
            driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",i);
            driver.findElement(By.id("regAddForm_password")).clear();
            driver.findElement(By.id("regAddForm_password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",i);
            driver.findElement(By.id("regAddForm_passwordNew")).clear();
            driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
            //Thread.sleep(5000);
            //put data back into excelsheet
            String textName=driver.findElement(By.xpath("//*[contains(text(),' Create an Account')]")).getText();
            reader.setCellData("RegTestData","Result",i,textName);
        }
    }

}