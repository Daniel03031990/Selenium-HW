package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverComands02 {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        //Open Chrome
        driver.manage().window().maximize();
        //Maximise the window
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        System.out.println(title);
        //navigate to google and print the title

        driver.navigate().to("https://www.syntaxprojects.com/");
        String title1=driver.getTitle();
        System.out.println(title1);
        //navigate to syntax and print the title
        driver.navigate().back();
        //navigate back to google url
        driver.navigate().refresh();
        //refresh google
        driver.quit();
        //quit



    }
}
