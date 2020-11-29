package objectPages;
import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateNewContact extends TestBase {
    /**
     * we need to create the Object Repository / Page Factory
     * Then we can initialize the Page Factory
     * Then we can create method
     */
    @FindBy(name = "first_name")
    WebElement enterFName;
    @FindBy(name = "last_name")
    WebElement lName;
    @FindBy(name = "middle_name")
    WebElement mName;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
    WebElement companyName;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
    WebElement clickOnSave;

    public CreateNewContact() {
        PageFactory.initElements(driver, this);    }
    // How to use the drop down Method?

    public void createNewAccout(String ftName, String lastName, String midName, String coName) { // either we create a separate element or inside the class
        enterFName.sendKeys(ftName);
        lName.sendKeys(lastName);
        mName.sendKeys(midName);
        companyName.sendKeys(coName);
        clickOnSave.click();

    }





// public void createNewAccout( String titile){ // either we create a separate element or inside the class
//    Select select = new Select(driver.findElement(By.name("title")));
//    select.selectByVisibleText(titile);
//}


    // public void createNewAccout(String ftName, String lastName, String midName, String coName) { // either we create a separate element or inside the class
    //        enterFName.sendKeys(ftName);
    //        lName.sendKeys(lastName);
    //        mName.sendKeys(midName);
    //        companyName.sendKeys(coName);
    //        clickOnSave.click();
    //    }



}







// Now the Page layer is done now time to go to the Test page and create the Test







// public void createNewAccout( String titile){ // either we create a separate element or inside the class
//    Select select = new Select(driver.findElement(By.name("title")));
//    select.selectByVisibleText(titile);
//}


// works good
//package objectPages;
//import base.TestBase;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//public class CreateNewContact extends TestBase {
//    /**
//     * we need to create the Object Repository / Page Factory
//     * Then we can initialize the Page Factory
//     * Then we can create method
//     */
//    @FindBy(name = "first_name")
//    WebElement enterFName;
//    @FindBy(name = "last_name")
//    WebElement lName;
//    @FindBy(name = "middle_name")
//    WebElement mName;
//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
//    WebElement companyName;
//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
//    WebElement clickOnSave;
//
//    public CreateNewContact() {
//        PageFactory.initElements(driver, this);    }
//    // How to use the drop down Method?
//
//    public void createNewAccout(String ftName, String lastName, String midName, String coName) { // either we create a separate element or inside the class
//        enterFName.sendKeys(ftName);
//        lName.sendKeys(lastName);
//        mName.sendKeys(midName);
//        companyName.sendKeys(coName);
//        clickOnSave.click();
//    }
//
//
//
//}
//
//// Now the Page layer is done now time to go to the Test page and create the Test
//
//
//
//
//
//
//
//// public void createNewAccout( String titile){ // either we create a separate element or inside the class
////    Select select = new Select(driver.findElement(By.name("title")));
////    select.selectByVisibleText(titile);
////}