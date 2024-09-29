package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class staticTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        //1. **Print All Entries with the Country "USA"**:
        //   - Dynamically search the table for entries where the country is **"USA"**.
        //   - Print all the rows matching criteria


       int count=1;

        List<WebElement> allcountries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement country:allcountries){
            String strCountry=country.getText();
            if (strCountry.equals("USA")){
                System.out.println(count);



               WebElement result=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(result.getText());
            }
            count++;
        }



    }
}
