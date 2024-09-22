package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        WebElement B1=driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        B1.click();

        WebElement B2=driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        B2.click();




        Set<String>allHandles=driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
           String url=driver.getCurrentUrl();


           if (url.equals("https://syntaxprojects.com/b1-page.php")){
               WebElement text=driver.findElement(By.xpath("//h2[text()='Welcome to B! page']"));
               if (text.getText().equals("Welcome to B1 page")){
                   System.out.println("The Url B1 has opened and the text B1 is correct " + text.getText());

               }else{
                   System.out.println("The Url B1 opened but the text is wrong ");
               }

           }else if(url.equals("https://syntaxprojects.com/b2-page.php")){
               WebElement text2 = driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
               if (text2.getText().equals("Welcome to B2 page")){
                   System.out.println("The Url B2 opened and the text B2 is correct " + text2.getText());
               }else{
                   System.out.println("The Url B2 opened but the text is wrong" + text2.getText());
               }



        }









      //WebElement B2=driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        //      B2.click();





      }





    }}

