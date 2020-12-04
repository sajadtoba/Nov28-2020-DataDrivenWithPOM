package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEbayFireFoxBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.au/");

        /**  for motor */

        WebElement elementMotor = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        Actions act = new Actions(driver);
        act.moveToElement(elementMotor).perform();
    }
}
