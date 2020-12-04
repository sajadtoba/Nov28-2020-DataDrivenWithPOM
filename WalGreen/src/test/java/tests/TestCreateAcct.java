package tests;

import base.TestBaseWalgreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.CreateAcctPageThird;
import pageObjects.IndexPageFirst;
import pageObjects.SignInPageSecond;

public class TestCreateAcct extends TestBaseWalgreen { // The class successfully run.
    IndexPageFirst indexPage;
    SignInPageSecond signInPageSecond;
    CreateAcctPageThird createAcctPageThird;

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testCreateNewAccount(){
        indexPage = new IndexPageFirst();
        //indexPage.mouseHoveWebelement(); // It will Land to the SignInPageSecond soe we store in that Page
        signInPageSecond =indexPage.mouseHoveWebelement();
        //signInPageSecond.createNewAcct(); // It will Land to the page CreateAcctPageThird
        createAcctPageThird = signInPageSecond.createNewAcct();
        createAcctPageThird.CreateNewAcctWithMultipleFields("Saj","Akbr","saj@yahoo.con","123dfre");


    }
}
