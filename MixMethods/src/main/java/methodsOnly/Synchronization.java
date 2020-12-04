package methodsOnly;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
        WebElement passWord = driver.findElement(By.name("reg_passwd__"));

        WebElement signUp = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]"));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        sendKeysMarjina(driver, firstName, 10, "Sajad");
        sendKeysMarjina(driver, lastName, 5, "Akba");
        sendKeysMarjina(driver, mobileNumber, 5, "3476541234");
        sendKeysMarjina(driver, passWord, 10, "test1234");
        //clickOn(driver,signUp,10);

        //}


//    public static void sendKeys(WebDriver driver, WebElement element, int timeout , String value){
//        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element)); // for which element we want to wait
//        element.sendKeys(value); // sendKeys() method is applied by the Selenium (the 1st sendKeys is the method name has nothing to do with this Sendkeys
//    }
        sendKeysMarjina(driver, passWord, 10, "test1234");
    }

/** Make the method with sendkeys with the Explicit wait      */
public static void sendKeysMarjina(WebDriver driver, WebElement element, int timeout , String value){
    new WebDriverWait(driver,timeout).
    until(ExpectedConditions.visibilityOf(element));
    element.sendKeys(value);
}

/** Make the Another method nice way for the click with the Explicit wait */ // For Click we do not need to use the sendKeys() method
public static void clickOn(WebDriver driver, WebElement element,int timeOut){
    //new WebDriverWait(driver,timeOut).until(ExpectedConditions.elementToBeClickable(element));
    new WebDriverWait(driver,timeOut).
    until(ExpectedConditions.elementToBeClickable(element));
    element.click();
}



}
