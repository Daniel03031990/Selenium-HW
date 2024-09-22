package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
//click Juice Radio Button
      WebElement juiceRB= driver.findElement(By.xpath("//input[@value='Juice']"));
      juiceRB.click();



//Click Hybrid Working Environment
      List<WebElement>workingEnv=driver.findElements(By.xpath("//input[@name='working_enviroment']"));for (WebElement each:workingEnv){
          if (each.getAttribute("value").equals("hybrid")){
              each.click();
          }
      }

// If the Spring radio button is disabled, click on the "Enable Buttons" button.
//   - Ensure that the Spring option is now enabled, then select it.

      WebElement springBt= driver.findElement(By.xpath("//input[@value='spring']"));
      WebElement click=driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
       click.click();
       springBt.click();

////By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
////   - Verify that the Winter option is displayed after clicking and is available for selection.
    WebElement winterBT= driver.findElement(By.xpath("//input[@value='winter']"));
   boolean DisplayedWB=winterBT.isDisplayed();
        System.out.println("Is the winter button displayed? " + DisplayedWB);

    if (!winterBT.isDisplayed()){
      WebElement HideButtons=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
      HideButtons.click();
     boolean isDiplayed =winterBT.isDisplayed();
        System.out.println("Winter button is diplayed? " + isDiplayed);
       boolean isavailable=winterBT.isEnabled();
        System.out.println("Is the winter button available? " + isavailable);


       WebElement LunchBt=driver.findElement(By.xpath("//input[@value='lunch']"));
       LunchBt.click();
    }





    }
}
