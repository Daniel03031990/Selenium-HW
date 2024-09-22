package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");


//- Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
      WebElement subscribe=driver.findElement(By.xpath("//input[@id='newsletter']"));
      if (subscribe.isEnabled()){
          subscribe.click();
      }
//Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
//   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));

        for(WebElement hobby:allHobbies){
            String valueOfOption = hobby.getAttribute("id");
            if(valueOfOption.equals("cooking") || valueOfOption.equals("reading")){
                hobby.click();
            }
        }



//Verify that the **Support** and **Music** checkboxes are not displayed by default.
//   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.
        WebElement supportCB = driver.findElement(By.xpath("//input[@value='Support' ]"));
        WebElement Music = driver.findElement(By.xpath("//input[@value='Music' ]"));
//        confirm they are not displayed
        if(!supportCB.isDisplayed() && !Music.isDisplayed()){
            WebElement showBtn = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            showBtn.click();
            Thread.sleep(2000);
            Music.click();
        }








    WebElement checkBox=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
      if (checkBox.isDisplayed()){
          checkBox.click();

      }

    WebElement clickMusic=driver.findElement(By.xpath("//input[@type='checkbox' and @value='Music']"));









        WebElement enablebutton =driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
     boolean isdisabled= enablebutton.isEnabled();
        System.out.println("The button is disabled? " + isdisabled);
        enablebutton.click();

      WebElement recieve=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
      recieve.click();









    }
}
