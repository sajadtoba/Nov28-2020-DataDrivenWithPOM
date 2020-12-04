package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHoverWithSelectItems {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercurytravels.co.in");

        // We found the WebElement

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]"));
        Actions action = new Actions(driver);
        //action.moveToElement(ele).perform();  // It works both ways either we use the build() method or not
        action.moveToElement(ele).build().perform();

        // 2nd Step we need to create the List because we have more than one WebElements

        List<WebElement> eleList = driver.findElements(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]/ul/li"));
        // 3rd we have the list of the Elements and we can use the for loop

        for (WebElement element : eleList)  // Now we can use the if else condition
        {
            if (element.getText().equals("Sell Forex")) ;
            {
                element.click();  // Then we go to break to come out of the loop
                break;
            }


        }
    }
}