package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        Actions actions = new Actions(driver);
        WebElement marjina = driver.findElement(By.linkText("Geography"));
        Thread.sleep(4000);  // This method does not work without Thread.sleep () method make sure with Class we have Throws Exception
        actions.moveToElement(marjina).click().perform();
    }
}







/** Same method above without in detail  */

// Actions actions = new Actions(driver);
//        WebElement main = driver.findElement(By.linkText("Geography"));
//        actions.moveToElement(main);
//
//        try {
//            //Thread.sleep(6000);
//            Thread.sleep(6000);
//            actions.click().build().perform();
//        }catch (Exception e){
//            System.out.println(e);
//        }