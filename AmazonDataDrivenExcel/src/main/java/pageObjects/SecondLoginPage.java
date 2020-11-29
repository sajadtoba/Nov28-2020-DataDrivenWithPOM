package pageObjects;

import base.TestBaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondLoginPage extends TestBaseAmazon {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement emai;
   @FindBy(id = "continue")
   WebElement continueBtn;

   // When we want to create new Account
    @FindBy(id = "createAccountSubmit")
    WebElement createAmazonAct;




    public SecondLoginPage(){
        PageFactory.initElements(driver,this);
    }

    //public void enterCredential( String emailsignIn){
        public ThirdPasswordPage enterCredential(String emailsignIn){
        emai.sendKeys(emailsignIn);
        continueBtn.click();
        return new ThirdPasswordPage();
    }

    //public void createNewAmazonAct(){
    public SecondCreateNewAccountPage createNewAmazonAct(){
        createAmazonAct.click(); // It will land to the CreateNewAcctPage
        return new SecondCreateNewAccountPage();
    }

}
