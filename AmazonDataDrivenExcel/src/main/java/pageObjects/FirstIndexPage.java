package pageObjects;

import base.TestBaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**  //@CacheLookup // We can only use the @CacheLookup if we know that webElement never change
 * we cannot use for each element
 * but if we want to change this @CacheLookup that will make the script very fast
 */

public class FirstIndexPage extends TestBaseAmazon {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]")
    @CacheLookup // We can only use the @CacheLookup if we know that webElement never change
    WebElement clickSigninBtn;
    // Search Items

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchItems;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")
    WebElement searchBtn;

    @FindBy(id = "nav-logo-sprites")
    WebElement amazonLogoOnIndexPage;



    public FirstIndexPage(){
        PageFactory.initElements(driver,this);
    }

    //public void clickSigninBtn(){
        public SecondLoginPage clickSigninBtn(){
        clickSigninBtn.click();
        return new SecondLoginPage();
    }
    //public void searchItemsOnIndexPage(String itemName){
        public SecondSearchResultPage searchItemsOnIndexPage(String itemName){
        searchItems.sendKeys(itemName);
        searchBtn.click();
        return new SecondSearchResultPage(); // It will Land to the Next Page SearchResult
    }

    //public void validateCompanyLogoOnIndexPage(){
        public boolean validateCompanyLogoOnIndexPage(){
        //amazonLogoOnIndexPage.isDisplayed();
            return amazonLogoOnIndexPage.isDisplayed();
    }
/** to get the current url and Title we do not need the webElements   */
    //public void validateIndexPageUrl(){
        public String validateIndexPageUrl(){
         //driver.getCurrentUrl();
        String actUrl = driver.getCurrentUrl();
        return actUrl;
    }



    }