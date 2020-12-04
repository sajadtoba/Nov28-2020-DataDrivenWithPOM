package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownUsingSelectClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        //1) We can create a webelement  to find the element by using the locator

        WebElement skillsDropDown = driver.findElement(By.id("Skills"));
        // 2) So we already found the element Now time to select the value which we need.

        Select skills = new Select(skillsDropDown); // There are 3 ways to select the values from the dropdown
        skills.selectByIndex(2);
        Thread.sleep(3000);

        skills.selectByVisibleText("Android");
        Thread.sleep(5000);

        skills.selectByValue("CSS");
    }



}
