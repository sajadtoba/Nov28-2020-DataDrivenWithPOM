package testCases;
import base.TestBase;
import objectPages.HomePages;
import objectPages.IndexPages;
import objectPages.LoginPages;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPages extends TestBase {
    IndexPages indexPages;
    LoginPages loginPages;
    HomePages homePages;

    @BeforeMethod
    public void setUp(){
        initialization();
        indexPages = new IndexPages();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testlogin(){
        //indexPages = new IndexPages();
        //indexPages.clickSigninBtn(); // this will land to the LoginPages
        loginPages =indexPages.clickSigninBtn();
        //loginPages.enterCredentials(prop.getProperty("emai"),prop.getProperty("pswd"));
        //homePages=loginPages.enterCredentials(prop.getProperty("emai"),prop.getProperty("pswd"));
        homePages = loginPages.enterCredentials("sajadny@yahoo.com","786Gojra");
    }

    // This test failed
    @Test
    public void testValidateLoginPageLogo(){
        //indexPages.validateLoginPageLogo(); // we can create a variable
        boolean result =indexPages.validateLoginPageLogo();
        Assert.assertTrue(result);
        System.out.println("Sumaira wants to know the result:        "+result);
    }
    @Test
    public void testRunIndependentlyValidateLoginPageLogo(){
        //indexPages = new IndexPages();
        //indexPages.validateLoginPageLogo(); // we can create a variable
        boolean result =indexPages.validateLoginPageLogo();
        Assert.assertTrue(result);
        System.out.println("Sajad wants to know the result:        "+result);
    }

}
