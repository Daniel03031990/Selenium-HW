package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/cssSelector-homework.php");
        driver.manage().window().maximize();

       WebElement UserId=driver.findElement(By.cssSelector("input[id='UserID']"));//long way
       UserId.sendKeys("Id23234221");

     WebElement Username=driver.findElement(By.cssSelector("input#UserName"));//shortcut
     Username.sendKeys("Daniel267356892");

     WebElement Lectureintro=driver.findElement(By.cssSelector("input[name='LectureIntro'"));
     Lectureintro.sendKeys("Hello everyone!!!");

     WebElement Rayfeedback =driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
     Rayfeedback.sendKeys("You are great");//Using class

     WebElement DuckyFeedback=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
     DuckyFeedback.sendKeys("Good job");

     WebElement ClientId=driver.findElement(By.cssSelector("input[name='ClientID'"));
     ClientId.sendKeys("travis3473423");

     WebElement Email=driver.findElement(By.cssSelector("input[name='email'"));
     Email.sendKeys("Stegea@122312.com");

     WebElement CourseTopic=driver.findElement(By.cssSelector("input[name='CourseTopic'"));
     CourseTopic.sendKeys("Math");








    }
}
