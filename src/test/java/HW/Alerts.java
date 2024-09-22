package HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
//. Birthday Reminder:
//   - Click on the "Birthday Reminder" button.
//   - When the alert appears, accept the alert.
       WebElement alertFT=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
       alertFT.click();
       Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        alert.accept();

        // Delete Confirmation:
        //   - Click on the **"Delete File"** button.
        //   - When the confirmation alert appears, **dismiss** the alert.
        //   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.


       WebElement Deletefile=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
       Deletefile.click();
        Thread.sleep(2000);

      Alert alert1=driver.switchTo().alert();
      alert1.dismiss();

     WebElement Cancel= driver.findElement(By.xpath("//p[@id='confirm-demo']"));
    String text= Cancel.getText();
        System.out.println(text);

        //3. Name Collection:
        //   - Click on the **"Enter Your Name"** button.
        //   - Accept the alert and provide a name.
        //   - Retrieve the name that appears on the
        //   screen UI and print it on the console, verifying that the correct name is displayed.

       WebElement enterName=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        enterName.click();
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Tony Montana");
        alert2.accept();




        WebElement text1=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
       if (text1.getText().equals("You have entered 'Tony Montana' !")){
           System.out.println("Tony Montana");
       }else{
           System.out.println("Try again");
       }











    }
}
