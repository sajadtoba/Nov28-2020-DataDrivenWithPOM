package testCases;

import base.TestBaseAmazon;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.SecondLoginPage;

public class TestIndexPage extends TestBaseAmazon {
    FirstIndexPage indexPage;
    SecondLoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }


    @Test
    public void testSignIn() throws Throwable {
        indexPage = new FirstIndexPage();
        //indexPage.clickSigninBtn();
        loginPage = indexPage.clickSigninBtn();
    }
    @Test
    public void testValidateCompanyLogo(){
        indexPage = new FirstIndexPage();
        //indexPage.validateCompanyLogoOnIndexPage(); // we need to create the variable to see if it is true or not
        boolean result = indexPage.validateCompanyLogoOnIndexPage();
        Assert.assertTrue(result);
        System.out.println("Lovely wife wants to know the result:  "+ result);
    }

    @Test
    public void testValidateUrl(){
        indexPage = new FirstIndexPage();
        //indexPage.validateIndexPageUrl();
        String actualUrl = indexPage.validateIndexPageUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("Sumaira wants to know actualUrl:       "+actualUrl);
        System.out.println(" Sajad                                 "+expectedUrl);
    }
}
