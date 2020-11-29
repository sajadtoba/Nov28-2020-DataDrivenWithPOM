package testCases;

import base.TestBaseAmazon;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.FourthHomePage;
import pageObjects.SecondLoginPage;
import pageObjects.ThirdPasswordPage;

public class PasswordPage extends TestBaseAmazon {
    FirstIndexPage indexPage;
    SecondLoginPage loginPage;
    ThirdPasswordPage passwordPage;
    FourthHomePage homePage;

    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void enterCredential(){
        indexPage = new FirstIndexPage();
        loginPage =indexPage.clickSigninBtn();
        //loginPage.enterCredential();
        passwordPage = loginPage.enterCredential("sajadny@yahoo.com");
        //passwordPage.enterCredential("786sajadny@yahoo.com");
        homePage = passwordPage.enterCredential("786sajadny@yahoo.com");
    }


}
