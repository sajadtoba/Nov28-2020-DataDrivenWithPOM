package testCases;
import base.TestBase;
import objectPages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FirstTestHomePages extends TestBase {
    IndexPages indexPages;
    LoginPages loginPages;
    HomePages homePages;
    ContactsPages contactsPages;
    CalanderPages calanderPages;
    DealsPages dealsPages;
    TaskPages taskPages;


    @BeforeMethod
    public void setUp(){
        initialization(); // After where we start in the beginning we need to create the Object inside the @BeforeMethod
        indexPages = new IndexPages();
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
    @Test
    public void testValidateUserNameonTheHomePage(){
        //indexPages.clickSigninBtn(); // That land to the LoginPage
        loginPages = indexPages.clickSigninBtn();
        //loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd")); // That page will Land to the HomePage
        homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd")); // So for got to HomePage Class
        //homePages.validateUserName(); // It will Land to the same page HomePage not going to anywhere
        boolean result = homePages.validateUserName();
        Assert.assertTrue(result);
        System.out.println("Sumaira wants to know the result:      "+result);
    }
    @Test
    public void testClickContactLabel(){
        loginPages = indexPages.clickSigninBtn();
        //loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd")); // That page will Land to the HomePage
        homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd")); // So for got to HomePage Class
        //homePages.validateUserName(); // It will Land to the same page HomePage not going to anywhere
        boolean result = homePages.validateUserName();
        Assert.assertTrue(result);
        System.out.println("Sajad wants to know the result:      "+result);
        //homePages.clickOnContactOnHomePage(); // It will Land to the ContactsPages
        contactsPages = homePages.clickOnContactOnHomePage();
    }
    @Test
    public void testClickCalanderlabelOnHomePage(){
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
        //homePages.clickOnCalanderLabel(); // It will land to the CalanderPages
        calanderPages = homePages.clickOnCalanderLabel();
    }
    @Test
    public void testClickDealslabelOnHomePage(){
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
        //homePages.clickOnDealsOnHomePage();
        dealsPages = homePages.clickOnDealsOnHomePage();
    }
    @Test
    public void testclicktheTaskLink(){
        //indexPages.clickSigninBtn(); // That will land to the Login Page
        loginPages = indexPages.clickSigninBtn();
        //loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
        homePages=loginPages.enterCredentials(prop.getProperty("email"),prop.getProperty("pswd"));
        //homePages.taskLinkOnHomePage();
        taskPages = homePages.taskLinkOnHomePage();
    }


}
