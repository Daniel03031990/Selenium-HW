package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");


      WebElement subscribe=driver.findElement(By.xpath("//input[@id='newsletter']"));
      if (subscribe.isEnabled()){
          subscribe.click();
      }

     List<WebElement> Hobies= driver.findElements(By.xpath("//input[@class='cb-element']"));
      for (WebElement Hoby:Hobies){
          if (Hoby.getAttribute("id").equals("reading")){
          Hoby.click();}
          if (Hoby.getAttribute("id").equals("cooking")){
              Hoby.click();
          }


          }
      WebElement supportBT=driver.findElement(By.xpath("//input[@value='Support']"));
     boolean checkSuportBt=supportBT.isDisplayed();
        System.out.println("is the support button displayed? " + checkSuportBt);

        WebElement checkMusicBt=driver.findElement(By.xpath("//input[@value='Music']"));
       boolean mucicCheck= checkMusicBt.isDisplayed();
        System.out.println("Is the music button displayed? " + mucicCheck);







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
        clickMusic.click();









    }
}
