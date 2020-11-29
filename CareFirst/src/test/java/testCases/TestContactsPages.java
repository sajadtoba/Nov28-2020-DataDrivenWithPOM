package testCases;

import base.TestBase;
import objectPages.ContactsPages;
import objectPages.HomePages;
import objectPages.IndexPages;
import objectPages.LoginPages;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestContactsPages extends TestBase {
    IndexPages indexPages;
    LoginPages loginPages;
    HomePages homePages;
    ContactsPages contactsPages;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        indexPages = new IndexPages();
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
        Thread.sleep(5000);
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }


    @Test
    public void testValidateContactTab() throws InterruptedException {
        contactsPages = homePages.clickOnContactOnHomePage();
        Thread.sleep(1000);
        contactsPages.clickShowBtn();
    }

    @Test
    public void testValidateContactTabToo() throws InterruptedException {
        contactsPages = homePages.clickOnContactOnHomePage();
        contactsPages.validateContactWord(); // We need to create a variable to Assert
        boolean result = contactsPages.validateContactWord();
        Assert.assertTrue(result);
        System.out.println("Sajad wants to know the result:                  " + result);
    }


    @Test
    public void testClickNewTab(){
        contactsPages = homePages.clickOnContactOnHomePage();
        contactsPages.clickTheNewTab();
    }





//    @Test
//    public void selectContactTest() throws InterruptedException {
//        contactsPages = homePages.clickOnContactOnHomePage();
//        Thread.sleep(5000);
//        contactsPages.selecNameOnContact();
//    }

















}

/** The test passed Successfully    */
//    @Test
//    public void testValidateContactTabToo() throws InterruptedException {
//        //homePages.clickOnContactOnHomePage();
//        //^^^^^^^^^^^indexPages = new IndexPages();
//        //***********loginPages = indexPages.clickSigninBtn();
//        //homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
//        //^^^^^^^^^^^homePages = loginPages.enterCredentials("sajadny@yahoo.com","786Gojra");
//        contactsPages = homePages.clickOnContactOnHomePage();
//        //Thread.sleep(1000);
//        contactsPages.validateContactWord(); // We need to create a variable to Assert
//        //contactsPages.clickShowBtn();
//
//       boolean result =contactsPages.validateContactWord();
//       Assert.assertTrue(result);
//        System.out.println("Sajad wants to know the result:                  "+result);
//    }

/** The test passed Successfully      Related the @Before Method  below*/

//   @BeforeMethod
//    public void setUp() throws InterruptedException {
//        initialization();
//        indexPages = new IndexPages();
//        //indexPages.clickSigninBtn(); // That will land to the LoginPage Class so we store inside the Login Page class
//        loginPages = indexPages.clickSigninBtn();
//        //loginPages.enterCredentials(prop.getProperty("emai"),prop.getProperty("pswd"));
//        homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
//        Thread.sleep(5000);
//    }
/**     Test passed succeffully                       */
// @Test
//    public void testValidateContactTab() throws InterruptedException {
//        //homePages.clickOnContactOnHomePage();
//        //indexPages = new IndexPages();
//        //loginPages = indexPages.clickSigninBtn();
//        //homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
//        //homePages = loginPages.enterCredentials("sajadny@yahoo.com","786Gojra");
//        contactsPages = homePages.clickOnContactOnHomePage();
//        Thread.sleep(1000);
//        //contactsPages.validateContactWord(); // We need to create a variable to Assert
//        contactsPages.clickShowBtn();
//    }
/**   Test passed succeffully                           */



// The method passed .............................. below whole class



//package testCases;
//
//import base.TestBase;
//import objectPages.ContactsPages;
//import objectPages.HomePages;
//import objectPages.IndexPages;
//import objectPages.LoginPages;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TestContactsPages extends TestBase {
//    IndexPages indexPages;
//    LoginPages loginPages;
//    HomePages homePages;
//    ContactsPages contactsPages;
//
//    @BeforeMethod
//    public void setUp() throws InterruptedException {
//        initialization();
//        indexPages = new IndexPages();
//        loginPages = indexPages.clickSigninBtn();
//        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
//        Thread.sleep(5000);
//    }
//
//    @AfterMethod
//    public void cleanUp() {
//        //driver.quit();
//    }
//
//
//    @Test
//    public void testValidateContactTab() throws InterruptedException {
//        contactsPages = homePages.clickOnContactOnHomePage();
//        Thread.sleep(1000);
//        contactsPages.clickShowBtn();
//    }
//
//    @Test
//    public void testValidateContactTabToo() throws InterruptedException {
//        contactsPages = homePages.clickOnContactOnHomePage();
//        contactsPages.validateContactWord(); // We need to create a variable to Assert
//        boolean result = contactsPages.validateContactWord();
//        Assert.assertTrue(result);
//        System.out.println("Sajad wants to know the result:                  " + result);
//    }
//
//}

