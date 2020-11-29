package pageObjects;

import base.TestBaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondCreateNewAccountPage extends TestBaseAmazon {
    @FindBy(name = "customerName")
    WebElement name;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement pswd;
    @FindBy(name = "passwordCheck")
    WebElement reEnterPswd;
    @FindBy(id = "continue")
    WebElement createActBtn;

    public SecondCreateNewAccountPage(){
        PageFactory.initElements(driver,this);
    }

    //public void createNewAcct(){
        public FourthHomePage createNewAcct(String acctName, String acctEmail, String acctPswd, String acctReEnterPswd){
        name.sendKeys(acctName);
        email.sendKeys(acctEmail);
        pswd.sendKeys(acctPswd);
        reEnterPswd.sendKeys(acctReEnterPswd);
        createActBtn.click();
        return new FourthHomePage();

    }

    //public void createNewAcct(){
    public FourthHomePage createNewAcctTwoParameters(String acctName, String acctEmail){
        name.sendKeys(acctName);
        email.sendKeys(acctEmail);
//        pswd.sendKeys(acctPswd);
//        reEnterPswd.sendKeys(acctReEnterPswd);
        createActBtn.click();
        return new FourthHomePage();

    }


    //public void createNewAcct(){
    public FourthHomePage createNewAcctThreeParameters(String acctName, String acctEmail,String acctPswd){
        name.sendKeys(acctName);
        email.sendKeys(acctEmail);
        pswd.sendKeys(acctPswd);
//        reEnterPswd.sendKeys(acctReEnterPswd);
        createActBtn.click();
        return new FourthHomePage();

    }

    //public void createNewAcct(){
    public FourthHomePage createNewAcctFourParameters(String acctName, String acctEmail,String acctPswd,String acctReEnterPswd){
        name.sendKeys(acctName);
        email.sendKeys(acctEmail);
        pswd.sendKeys(acctPswd);
       reEnterPswd.sendKeys(acctReEnterPswd);
        createActBtn.click();
        return new FourthHomePage();

    }





}



// Whole class codes and it runs fine

//package pageObjects;
//
//import base.TestBaseAmazon;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class SecondCreateNewAccountPage extends TestBaseAmazon {
//    @FindBy(name = "customerName")
//    WebElement name;
//    @FindBy(name = "email")
//    WebElement email;
//    @FindBy(name = "password")
//    WebElement pswd;
//    @FindBy(name = "passwordCheck")
//    WebElement reEnterPswd;
//    @FindBy(id = "continue")
//    WebElement createActBtn;
//
//    public SecondCreateNewAccountPage(){
//        PageFactory.initElements(driver,this);
//    }
//
//    //public void createNewAcct(){
//        public FourthHomePage createNewAcct(String acctName, String acctEmail, String acctPswd, String acctReEnterPswd){
//        name.sendKeys(acctName);
//        email.sendKeys(acctEmail);
//        pswd.sendKeys(acctPswd);
//        reEnterPswd.sendKeys(acctReEnterPswd);
//        createActBtn.click();
//        return new FourthHomePage();
//
//    }
//
//}
//
//
//
//// Whole class codes and it runs fine