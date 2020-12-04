package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        // I am seeing the window is very small
        driver.manage().window().maximize();
        // We need to use the Actions Class ()method so before use the Actions class method we need to create the object for the action

        Actions actions = new Actions(driver);
        // 1st we need to create the WebElement
        WebElement rightClickBtn = driver.findElement(By.cssSelector(".context-menu-one"));
        actions.contextClick(rightClickBtn).build().perform();
        // i want to get the text and also want to print it of the copy webElement
        WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        copy.getText();  // if we want to print then we need to create variable and store inside of this variable then we can use sout
        String copyText = copy.getText();
        System.out.println("Sajad wants to see the print:  "+copyText);
        copy.click(); // if we want to perform the copy.click() then we cannot have the same time delete at the same time run
        // ----------- If we want to delete
//        WebElement delete = driver.findElement(By.cssSelector(".context-menu-icon-delete"));
//        String deleteText = delete.getText();
//        System.out.println("Sajad wants to see the print:  "+deleteText);



    }
}
