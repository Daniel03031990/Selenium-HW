package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath04 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

       WebElement hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));

        hobbies.sendKeys("Boxing");

        WebElement ClickButton=driver.findElement(By.xpath("//button[text()='Click Here']"));
        ClickButton.click();

        WebElement favouriteMovie=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favouriteMovie.sendKeys("Lord of the Rings");

        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit')]"));
        String textOff=text.getText();
        System.out.println(textOff);

        WebElement city=driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Boston");

        WebElement personalMail=driver.findElement(By.xpath("//input[@name='PrivateEmail' ]"));
        personalMail.sendKeys("Personal@mail.com");


        WebElement Officeemail= driver.findElement(By.xpath("//input[@name='OfficeEmail' ]"));
       Officeemail.sendKeys("@mankoxa.com");

        WebElement ProfesionalEmail=driver.findElement(By.xpath("//input[@name='ProfessionalEmail']"));
        ProfesionalEmail.sendKeys("stegaru@email.com");

        WebElement name= driver.findElement(By.xpath("//input[@id='clientName' and @class='form-control']"));
        name.sendKeys("Gregory");

       WebElement Id=driver.findElement(By.xpath("//input[@name='clientId' and @class='form-control']"));
       Id.sendKeys("12452455");

       WebElement StreetNr=driver.findElement(By.xpath("//input[@name='StreetNo']"));
       StreetNr.sendKeys("25");

      WebElement houseNr=driver.findElement(By.xpath("//input[@name='HouseNo']"));
      houseNr.sendKeys("12");





    }
}
