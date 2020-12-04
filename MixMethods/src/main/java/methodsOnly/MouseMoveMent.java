package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveMent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]"))).build().perform();
        //act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"))).build().perform();

        Thread.sleep(3000);
//GOOD***********driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
//Good*********driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/a[2]/span[1]")).click();
// Good********driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[12]/span[1]")).click();

// It clicked the create a list
        //Good***********driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")).click();
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[7]/span[1]")).click();



    }


}






/** It works good with Amazon website     */
//public class MouseMoveMent {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        //driver.get("https://www.walgreens.com/");
//        driver.get("https://www.amazon.com/");
//        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]"))).build().perform();
//    }
