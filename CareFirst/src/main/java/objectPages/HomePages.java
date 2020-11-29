package objectPages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages extends TestBase {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]")
    WebElement userName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[3]/span[1]")
    WebElement clickOnContactLabel;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[2]/span[1]")
    WebElement clickCalanderLabel;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[5]/span[1]")
    WebElement clickOnDealsLabel;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[6]/span[1]")
    WebElement clickOnTaskLink;




    public HomePages(){
        PageFactory.initElements(driver,this);
    }

    //public void validateUserName(){
        public boolean validateUserName(){
        //userName.isDisplayed(); // this will not land another page
        return userName.isDisplayed();
    }
    //public void clickOnContactOnHomePage(){
        public ContactsPages clickOnContactOnHomePage(){
        clickOnContactLabel.click(); // It will land to the Contactspages
        return new ContactsPages();
    }

    //public void clickOnCalanderLabel(){
    public CalanderPages clickOnCalanderLabel(){
        clickCalanderLabel.click(); // It will land to the CalanderPage
        return new CalanderPages();
    }
    //public void clickOnDealsOnHomePage(){
        public DealsPages clickOnDealsOnHomePage(){
        clickOnDealsLabel.click(); // It  will land to the DealPages
       return new DealsPages();
    }
    //public void taskLinkOnHomePage(){
        public TaskPages taskLinkOnHomePage(){
        clickOnTaskLink.click(); // it will land to TaskPage
        return new TaskPages();
    }





}
