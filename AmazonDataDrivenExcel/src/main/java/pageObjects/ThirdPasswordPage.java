package pageObjects;

import base.TestBaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPasswordPage extends TestBaseAmazon {
    @FindBy(name = "password")
    WebElement pswd;
    @FindBy(id = "signInSubmit")
    WebElement id;

    public ThirdPasswordPage(){
        PageFactory.initElements(driver,this);
    }

    //public void enterCredential(){
        public FourthHomePage enterCredential(String passWord){
        pswd.sendKeys(passWord); // It will land to the HomePage
        id.click();
        return new FourthHomePage();
    }











}

