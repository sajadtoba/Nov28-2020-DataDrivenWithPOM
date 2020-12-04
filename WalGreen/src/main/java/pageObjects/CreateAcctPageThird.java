package pageObjects;

import base.TestBaseWalgreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAcctPageThird extends TestBaseWalgreen {
    @FindBy(name = "firstName")
    WebElement fName;
    @FindBy(name = "lastName")
    WebElement lName;
    @FindBy(id = "wag-email")
    WebElement eMail;
    @FindBy(id = "wag-password")
    WebElement pswd;
    @FindBy(id = "wag-showpassword-checkbox")
    WebElement showBtn;
    @FindBy(id = "wag-terms-checkbox")
    WebElement checkMarkBox;
    @FindBy(xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/section[1]/section[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[3]/form[1]/section[2]/span[1]/a[2]/span[1]")
    WebElement conBtn;


    public CreateAcctPageThird(){
        PageFactory.initElements(driver,this);
    }

   // public void CreateNewAcctWithMultipleFields(String firstName, String lastName, String email, String passWord){
        public AccountPageFourth CreateNewAcctWithMultipleFields(String firstName, String lastName, String email, String passWord){
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
        eMail.sendKeys(email);
        pswd.sendKeys(passWord);
        showBtn.click();
        checkMarkBox.click();
        conBtn.click();
        return new AccountPageFourth();
    }

}





















//    WebElement firstName = driver.findElement(By.name("firstName"));
//        firstName.sendKeys("sajad");
//
//        WebElement lastname = driver.findElement(By.name("lastName"));
//        lastname.sendKeys("akb");
//        WebElement eMail = driver.findElement(By.id("wag-email"));
//        eMail.sendKeys("saj@yahoo.com");
//        WebElement pswd = driver.findElement(By.id("wag-password"));
//        pswd.sendKeys("123sad");
//        WebElement showbtn = driver.findElement(By.id("wag-showpassword-checkbox"));
//        showbtn.click();
//        WebElement checkBtn = driver.findElement(By.id("wag-terms-checkbox"));
//        checkBtn.click();