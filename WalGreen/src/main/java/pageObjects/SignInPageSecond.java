package pageObjects;

import base.TestBaseWalgreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageSecond extends TestBaseWalgreen {
    // We need to create 3 main steps
    // Create the Object Repository / Page Factory
    // 2) create the constructor
    // 3 create the methods

    @FindBy(id = "create_btn")
    WebElement createAcct;



    public SignInPageSecond(){
        PageFactory.initElements(driver,this);
    }

    //public void createNewAcct(){
        public CreateAcctPageThird createNewAcct(){
        createAcct.click();
        return new CreateAcctPageThird();
    }



}
