package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
       WebElement Fruits= driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
//Use the **Select** class to select the option **"Pear"** from the dropdown.
//   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
        Select sel=new Select(Fruits);
        sel.selectByIndex(3);
//Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.

        List<WebElement> Options=sel.getOptions();
        for (int i = 1; i < Options.size(); i++) {
            System.out.println(Options.get(i).getText());
        }





        //First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.

      WebElement theHobies=driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel1=new Select(theHobies);
      boolean isMultiple=sel1.isMultiple();
        System.out.println("Is the dropdown Multiple ? "+isMultiple);

        //Using the **Select** class, make the following selections:
        //     - **Traveling**
        //     - **Cooking**
        //     - **Gardening**
        sel1.selectByIndex(1);

        sel1.selectByValue("Cooking");

        sel1.selectByVisibleText("Gardening");

    WebElement getAll=driver.findElement(By.xpath("//button[@id='get_all']"));
    getAll.click();

        System.out.println("All that we selected");

        List<WebElement> AllOptions=sel1.getAllSelectedOptions();
        for (WebElement option:AllOptions){
            System.out.println(option.getText());

        }
        // After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
        //   - Click the **"Get All Selected"** button again and print the result on the console.

        Thread.sleep(5000);


        sel1.deselectByIndex(1);

        getAll.click();
        System.out.println("After we deselect 'Traveling'");
        List<WebElement> AlOptions=sel1.getAllSelectedOptions();
        for (WebElement option:AlOptions){
            System.out.println(option.getText());

        }















    }
}
