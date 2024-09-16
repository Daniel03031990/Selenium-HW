package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex01 {
    public static void main(String[] args) {


        WebDriver driver=new FirefoxDriver();
        //1 Open firefox browser
        driver.get("https://www.syntaxprojects.com/");
        //2 maximize the window
        driver.manage().window().maximize();
        // get and print the url
        String url=driver.getCurrentUrl();
        System.out.println(url);
        // get and print the title
        String title=driver.getTitle();
        System.out.println(title);
        //Close everything
        driver.quit();


    }
}
