package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXPath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/advanceXpath-homework.php");
        driver.manage().window().maximize();

        //1.The user should enter the names of books in reverse order from least favorite to favorite
        // using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
        //2. The user should enter the name of their favorite book using advanced Xpath.
        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        //4. The form should submit successfully only if all fields are filled out correctly using the
        // appropriate advanced Xpath expressions.(to be removed)


        WebElement leastFavorite =driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavorite.sendKeys("Harry Potter");


        WebElement mediumFavorite=driver.findElement(By.xpath("//input[@class='form-control']/following-sibling::input[1]"));
        mediumFavorite.sendKeys("Lord of the Rings");


        WebElement mostFavorite=driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[3]"));
        mostFavorite.sendKeys("World and Peace");


      WebElement favorite=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
      favorite.sendKeys("World and Peace");

      WebElement medium=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
      medium.sendKeys("Lord of the Rings");

      WebElement lessfavourite=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
      lessfavourite.sendKeys("Harry Potter");



      WebElement GrandParent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
      GrandParent.sendKeys("GrandPa");

      WebElement Parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
      Parent.sendKeys("Parent");

      WebElement Child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
      Child.sendKeys("Child");

    }

}
