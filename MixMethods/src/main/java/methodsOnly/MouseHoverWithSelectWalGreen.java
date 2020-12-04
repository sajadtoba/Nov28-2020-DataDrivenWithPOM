package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHoverWithSelectWalGreen {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.mercurytravels.co.in");
        driver.get("https://www.walgreens.com/");


        /** Below is mpousehover  moveToElement() method */
        WebElement abc = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(abc).click().perform();

        WebElement accountHome = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]"));
        Thread.sleep(4000);
        accountHome.click();
        WebElement createNewAcct = driver.findElement(By.id("create_btn"));
        createNewAcct.click();

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("sajad");

        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("akb");
        WebElement eMail = driver.findElement(By.id("wag-email"));
        eMail.sendKeys("saj@yahoo.com");
        WebElement pswd = driver.findElement(By.id("wag-password"));
        pswd.sendKeys("123sad");
        WebElement showbtn = driver.findElement(By.id("wag-showpassword-checkbox"));
        showbtn.click();
        WebElement checkBtn = driver.findElement(By.id("wag-terms-checkbox"));
        checkBtn.click();




        // We found the WebElement

        //WebElement ele = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]"));


        // 2nd Step we need to create the List because we have more than one WebElements

        // List<WebElement> eleList = driver.findElements(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]/ul/li"));
//
//        List<WebElement> elelistabc = driver.findElements(By.xpath("/html/body/header/div[1]/nav/div/div/div[4]/div/ul/li"));
//
//        for (WebElement element : elelistabc)
//        {
//            if (element.getText().equals("Account Home")) ;
//            {
//                element.click();
//                break;
//            }
//
//
//        }
//    }
    }
}