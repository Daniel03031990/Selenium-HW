package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWaits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
//**Change Text**:
//   - Click on the button **"Click me to change text!"**.
//   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement ClickBtChangeText=driver.findElement(By.xpath("//button[@id='changetext_button']"));
      ClickBtChangeText.click();


        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement ChangedText=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(ChangedText.getText());

        //**Enable Button**:
        //   - Click on the button **"Click me to enable button"**.
        //   - Wait for the button to be enabled, and once it's enabled, click on it.

       WebElement enableBT=driver.findElement(By.xpath("//button[@id='enable_button']"));
       enableBT.click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
      WebElement BtClick=driver.findElement(By.xpath("//button[text()='Button']"));
      BtClick.click();

      //**Checkbox Checked Based on Click**:
        //   - Click on the button **"Click me to check the checkbox"**.
        //   - Wait for the checkbox to be checked, then print the status of **isSelected**
        //   on the console to verify if the checkbox is enabled.
       WebElement ClickMe=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
       ClickMe.click();
       wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
      WebElement isSelected=driver.findElement(By.xpath("//input[@id='checkbox']"));
     boolean selection=isSelected.isSelected();
        System.out.println("Is the element enabled? "+ selection);



    }
}
