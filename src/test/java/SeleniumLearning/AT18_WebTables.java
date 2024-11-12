package SeleniumLearning;
import BaseClass.OpenBrowser;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AT18_WebTables extends OpenBrowser  {
    @Test
    public void table() {
        OpenBrowser.NavToWeb("C:\\Users\\softw\\IdeaProjects\\AshishProject\\src\\main\\java\\Resources\\webtablehtml.html");
        //get column count
        List<WebElement> ColCnt= driver.findElements(By.xpath("/html/body/table/thead/tr/th"));
        int colSize =ColCnt.size();
        System.out.println("colSize : "+ colSize); //7
        //get row count -- other than header
        List<WebElement> rowcount = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        int rowSize = rowcount.size();
        System.out.println("rowSize :" + rowSize); //4
        //Get cell value
        // row1, data 1 , this is basically like hardcoding to get a specific value
        //selenium way
        WebElement CellVal=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
        System.out.println("CellVal : "+CellVal.getText()); //UAE
        //or --java way
        String CellVal1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]")).getText();
        System.out.println("CellVal1 : "+ CellVal1); //UAE
        //------real code starts from here---------------
        // to print all the values in the row which has header as "clock tower hotel"
        String sRowVal="Clock Tower Hotel";
        // get all row headings under structure
        List <WebElement> HeadVal=driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        int NumCells = HeadVal.size();
        System.out.println("NumCells  :" + NumCells); //4
        //cell count
        List <WebElement> TotlCellCnt =driver.findElements(By.xpath("//html/body/table/tbody/tr[1]/td"));
        int CellSize = TotlCellCnt.size();
        System.out.println("CellSize :" + CellSize); //6
        //this code is for finding the headers values in row
        outerloop:
        for(int i=1;i<=NumCells;i++){
            String sValue =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th")).getText();
            System.out.println("RowHeaderValue is : " + sValue);
           //this code is for finding the headers values in row
            if(sValue.equalsIgnoreCase(sRowVal)){
                //this code is for finding the row values associated with header
                for(int j=1;j<=CellSize;j++){
                    String RowValue  =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
                    System.out.println("RowValue is : " + RowValue);

                }
                break outerloop;
            }
        }
    }
}
