package tests;

import base.TestBaseWalgreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.CreateAcctPageThird;
import pageObjects.IndexPageFirst;
import pageObjects.SignInPageSecond;

public class TestSignInPage extends TestBaseWalgreen {
    IndexPageFirst indexPage;
    SignInPageSecond signInPage;
    CreateAcctPageThird createAcctPage;

    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void testCreateNewAcct(){
        indexPage = new IndexPageFirst();
        //indexPage.accountBtn(); // After click the Account Btn where do  not Land any other Class
        indexPage.mouseHoveWebelement(); // After we click then we will Land on the SignInPage so we store inside the signInPage
        signInPage = indexPage.mouseHoveWebelement();
        signInPage.createNewAcct(); // After we create the new Account then where do we land We stay on the Same page

    }

}
