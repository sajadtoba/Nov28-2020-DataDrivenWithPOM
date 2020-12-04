package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.au/");
        //driver.get("https://www.walgreens.com/");


        //driver.get("https://www.ebay.com.au/");


        //driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")); // Then we can store into a WebElement
//        WebElement electronic = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//        Actions action = new Actions(driver);
//        action.moveToElement(electronic).perform();

        /**  for motor */

//        WebElement elementMotor = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
//        Actions act = new Actions(driver);
//        act.moveToElement(elementMotor).perform();


        /**  for Home And Garden */

//        WebElement eleHomeAndGarde = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
//        Actions action = new Actions(driver);
//        action.moveToElement(eleHomeAndGarde).perform();
        /**  for Toys */

//        WebElement elementToys = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/ul[1]/li[9]/a[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(elementToys).perform();

        /**  for Select  by using click() method*/

//        WebElement element = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
//        element.click();

        /**  for Select Items by mousehover method   moveToElement() method */





        WebElement element = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

        // For the WalGreen


//        WebElement abc = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"));
//        //abc.click();
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(abc).click().perform();








    }
}














