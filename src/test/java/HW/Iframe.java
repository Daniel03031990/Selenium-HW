package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");


        //1. Select Age Checkbox:
        //   - Select the **Age** checkbox.
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);

       WebElement age =driver.findElement(By.xpath("//input[@type='checkbox']"));
       age.click();

        //2. **Select City**:
        //   - Select any city from the dropdown.

       driver.switchTo().parentFrame();

       WebElement city= driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(city);
        sel.selectByIndex(1);


        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

        WebElement userName=driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("Steven Jobs");

        //3. **Enter Username**:
        //   -enter your username in the **Username** field.



    }
}
