package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/bootstrap-date-picker-demo.php");
        driver.findElement(By.xpath("//input[@id='start_date']")).click();//click start Date


        // returns current month on the calendar



        boolean notmonth=true;
        while (notmonth){
            WebElement startmonth =driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
            String currentmonth= startmonth.getText();
            if (currentmonth.equals("January 2025")){
                List<WebElement> Dates=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for (WebElement date:Dates){
                    String strDate= date.getText();
                    if (strDate.equals("9")){
                        date.click();
                        break;
                    }
                }
                notmonth=false;
            }else {

                WebElement nextButton=driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));//retrieve next button
                nextButton.click();
            }



        }
        driver.findElement(By.xpath("//input[@id='end_date']")).click();//click end date

        boolean notYear=true;
        while (notYear){
            WebElement endMonth=driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
            String strEndM=endMonth.getText();
            if (strEndM.equals("February 2025")){
                List<WebElement>date2=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for (WebElement strDate2 :date2) {
                    String strdate = strDate2.getText();
                    if (strdate.equals("22")){
                        strDate2.click();
                        break;
                    }

                }
                notYear=false;
            }else{
                driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]")).click();

            }
        }
    }
}
