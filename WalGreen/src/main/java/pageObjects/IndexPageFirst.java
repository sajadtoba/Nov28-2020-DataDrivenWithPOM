package pageObjects;

import base.TestBaseWalgreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPageFirst extends TestBaseWalgreen {
    // We need to create the Page Factory
    // Then we can initialize the Page factory
    // Then we create the methods


    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]")
    WebElement clickAcctBtn;
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]")
    WebElement accountHome;







    public IndexPageFirst(){
        PageFactory.initElements(driver,this);
    }

    public void accountBtn(){
        clickAcctBtn.click();
    }


    public SignInPageSecond mouseHoveWebelement(){
        WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[4]/div[1]/a[1]/span[1]/strong[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).click().build().perform();
        accountHome.click(); // After click what is the Landing page
        return new SignInPageSecond();
    }


}









