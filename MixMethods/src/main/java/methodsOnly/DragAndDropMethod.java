package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();                  // 1st
        driver.get("https://jqueryui.com/droppable/");          // 2nd
        driver.switchTo().frame(0);                           // 3rd We are already inside the Frame by default the index is 0 zero
        // After enter the Frame
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));
        // We have 2 elements and able to drag and drop  and Actions class has a method to drag and drop
        Actions actions = new Actions(driver);
        // What what we need to do it?  we need to click and hold the which Element  (We need to click and hold th source element)
        //actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

        /** How to make it as like sequence     using the enter and break the script / code into few lines*/
        actions.
        clickAndHold(sourceElement).
        moveToElement(targetElement).
        release().build().perform();
    }
}
