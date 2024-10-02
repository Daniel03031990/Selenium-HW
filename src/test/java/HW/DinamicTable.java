package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DinamicTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();


        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //click the pim Button



       List<WebElement> Ids=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        boolean notFound=true;
        while (notFound){


            int count=1;
       for (WebElement id:Ids){
           String strID=id.getText();
           if (strID.equals("111005A")){
               System.out.println(count);
             WebElement ClickId=driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
             ClickId.click();
             notFound=false;


           }
           count++;
       }
       if (notFound){
           WebElement nextElement=driver.findElement(By.xpath("//a[text()='Next'][1]"));
           nextElement.click();
           Ids=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

       }}


    }
}
