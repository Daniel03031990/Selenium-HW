package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        driver.manage().window().maximize();

        WebElement fullName =driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Bee");

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("www.JohnBee@1234.com");

        WebElement ClientName=driver.findElement(By.id("clientNameId"));
        ClientName.sendKeys("Marc Beeggle");

        WebElement ClientId=driver.findElement(By.name("ClientId"));
        ClientId.sendKeys("234523342");

        WebElement ClientFeedback=driver.findElement(By.id("ClientfeedbackId"));
        ClientFeedback.sendKeys("well done");

        WebElement projectName =driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("al2345");

        WebElement ProjectDeadLine=driver.findElement(By.id("ProjectTimeId"));
        ProjectDeadLine.sendKeys("12/54/78");

        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("24 Magal Road");

        WebElement PermanentAddress=driver.findElement(By.id("PermanentAddressId"));
        PermanentAddress.sendKeys("6 Main road");

        WebElement Submit=driver.findElement(By.name("btn-submit"));
        Submit.click();

        WebElement clickHere=driver.findElement(By.linkText("Click Here."));
        clickHere.click();





























    }
}
