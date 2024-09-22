package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownWithoutSelectTag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");


       WebElement dropdown=driver.findElement(By.xpath("//div[@id='dream_fruits']"));

       dropdown.click();


     List<WebElement> Options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

     for (WebElement option : Options){
        String optionText= option.getText();
        if (optionText.equals("Mango")){
            option.click();
        }
     }

    WebElement favouriteH=driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
     favouriteH.click();

   List<WebElement> Hobies= driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
   for (WebElement Hobby:Hobies){
       String Hobbytext= Hobby.getText();
       if (Hobbytext.equals("Reading")){
           Hobby.click();
       }
   }


    }
}
