package objectPages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPages extends TestBase {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]/span[2]")
    WebElement clickOnSignBtn;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[2]")
    WebElement loginPageLogo;

    // Initialize the webElement
    public IndexPages(){
        //PageFactory.initElements(driver,IndexPages.class); // or
        PageFactory.initElements(driver,this);
    }
    // We create the methods
    //public void clickSigninBtn(){
        public LoginPages clickSigninBtn(){
        clickOnSignBtn.click();
        return new LoginPages();
    }

    //
    //public void validateLoginPageLogo(){
        public boolean validateLoginPageLogo(){
        //loginPageLogo.isDisplayed(); // this method will not land to another Page so retur must on the same page
            return loginPageLogo.isDisplayed();

    }
}
