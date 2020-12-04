package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverWalGreen {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.ebay.com.au/");
        driver.get("https://www.walgreens.com/");

        /** Simple click() method */

        WebElement acct = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"));
        acct.click();



        /** Below is mpousehover  moveToElement() method */
        WebElement abc = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(abc).click().perform();


    }
}