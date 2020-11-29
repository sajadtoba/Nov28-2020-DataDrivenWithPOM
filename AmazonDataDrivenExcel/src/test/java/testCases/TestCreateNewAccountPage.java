package testCases;

import base.TestBaseAmazon;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.SecondCreateNewAccountPage;
import pageObjects.SecondLoginPage;

public class TestCreateNewAccountPage extends TestBaseAmazon {
    FirstIndexPage indexPage;
    SecondLoginPage loginPage;
    SecondCreateNewAccountPage createNewAccountPage;
    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void createNewAccount(){
        indexPage = new FirstIndexPage();
        //indexPage.clickSigninBtn(); // That will Land to the LoginPage
        loginPage = indexPage.clickSigninBtn();
        //loginPage.createNewAmazonAct();
        createNewAccountPage = loginPage.createNewAmazonAct();
        createNewAccountPage.createNewAcct("Sumaira","sami786@gmail.com","786gojra","786gojra");
    }

    @Test
        public void createNewAccountTwoParameters(){
            indexPage = new FirstIndexPage();
            //indexPage.clickSigninBtn(); // That will Land to the LoginPage
            loginPage = indexPage.clickSigninBtn();
            //loginPage.createNewAmazonAct();
            createNewAccountPage = loginPage.createNewAmazonAct();
            createNewAccountPage.createNewAcctTwoParameters("Sumaira","sami786@gmail.com");
        }

}
