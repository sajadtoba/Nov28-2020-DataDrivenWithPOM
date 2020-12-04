package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public class MouseHoverEbaySafariBrowser {
    //public static WebDriver driver;
    public static void main(String[] args) {
        /**       How to setUp the Safari Driver for automation

         We do not use the System.setProperty() method for the Safari
        We make sure your safari Develop tool is Allow Remote Automation setUp
        1) open the Safari Browser 2) Go to preference 3) Check mark Show Develop menu in menu bar
        4) Then Go to the Develop tool at the main tab and then check the Allow Remote Automation
         */

        //System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall each time
        //driver = new SafariDriver();

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com.au/");

        /**  for motor */

        WebElement elementMotor = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        Actions act = new Actions(driver);
        act.moveToElement(elementMotor).perform();
    }








}
