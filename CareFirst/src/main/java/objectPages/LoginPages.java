package objectPages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends TestBase {

    @FindBy(name = "email")
    WebElement enterEmail;
    @FindBy(name ="password")
    WebElement enterPswd;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
    WebElement clickLoginBtn;

    // We need to create the Constructor to initialize the webElements

    public LoginPages(){
        //PageFactory.initElements(driver,LoginPages.class); // or we can use java keyword this to initialize the webelements
        PageFactory.initElements(driver,this);
    }

    //public void enterCredentials(String email, String pswd){
        public HomePages enterCredentials(String email, String pswd){
        enterEmail.sendKeys(email);
        enterPswd.sendKeys(pswd);
        clickLoginBtn.click();
       return new HomePages();
    }











    //public void getPageTitle(){
        public String getPageTitle(){
        return driver.getTitle(); // landing on the same page so return same page
    }
    //public void getLoginPageUrl(){
        public String getLoginPageUrl(){
            //driver.getCurrentUrl(); // landing on the same page so return the same page
        return driver.getCurrentUrl();  // It will bring the url for the IndexPage not the LoginPage
    }
}
