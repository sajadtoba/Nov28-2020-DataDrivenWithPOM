package objectPages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPages extends TestBase {
    @FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement valideContact;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
    WebElement showBtn;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
    WebElement clickNewContact;



    public ContactsPages(){
        //PageFactory.initElements(driver,ContactsPages.class); //  sometimes it throws OverTack Error
        PageFactory.initElements(driver,this);
    }
    //public void clickShowBtn(){
        public void clickShowBtn(){
            //showBtn.click(); // It will land to the same page
            showBtn.click();// It will land to the same page
    }

// public void validateContactWord(){
        public boolean validateContactWord(){
        //validateContact.isDisplayed(); // It will land on the same page so we do not need to create another Class
        return valideContact.isDisplayed();
            //return contactsLink.isDisplayed();
    }
    //public void clickTheNewTab(){
        public CreateNewContact clickTheNewTab(){
        clickNewContact.click(); // After Click It will land to the create new Contact page
        return new CreateNewContact();
    }




}




    /** Now I am going to prepare for the Data Driven Data  1st I need to create  a method to click on the Contact page.
     *
     */
//    public void clickOnNewContactLink(){
//        clickNewContact.click(); // It will land on the same page and also it is not return just only click
//        Actions actions = new Actions(driver); // Make it visible
//        actions.moveToElement(clickOnContactLabel).build().perform(); // We created the webElement above Page Factory or Object Library
//        // After it becomes visible then able to click the New Contact
//        clickNewContact.click();
//    }

/** I prefer create a new class instead of keeping inside the contact */
// public void clickTheNewTab(){ // It will not Land anyother page it will stay on the same page.
//        clickNewContact.click(); // it is just click and it will return on the same page just move the but not return anything
//
//    }