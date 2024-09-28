package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWaits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


      WebElement ClickBt=driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
      ClickBt.click();
     WebElement Option1Bt=driver.findElement(By.xpath("//input[@value='Option-1']"));
      Option1Bt.click();
      Option1Bt.getText();

    }
}
