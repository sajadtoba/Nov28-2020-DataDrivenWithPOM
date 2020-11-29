package testCases;

import base.TestBaseAmazon;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.SecondCreateNewAccountPage;
import pageObjects.SecondLoginPage;

public class TestCreateNewAccountPageWithDataProvider extends TestBaseAmazon {
    FirstIndexPage indexPage;
    SecondLoginPage loginPage;
    SecondCreateNewAccountPage createNewAccountPage;
    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(dataProvider = "CreateNewAcct",dataProviderClass = DataProviderAmazon.class)
    public void createNewAccountTwoParameters(String acctName, String actEmail){
        indexPage = new FirstIndexPage();
        //indexPage.clickSigninBtn(); // That will Land to the LoginPage
        loginPage = indexPage.clickSigninBtn();
        //loginPage.createNewAmazonAct();
        createNewAccountPage = loginPage.createNewAmazonAct();
        //createNewAccountPage.createNewAcctTwoParameters("Sumaira","sami786@gmail.com");
        createNewAccountPage.createNewAcctTwoParameters(acctName,actEmail);
    }
    @Test(dataProvider = "CreateNewWithThreeColumns",dataProviderClass = DataProviderAmazon.class)
    public void createNewAccountThreeParameters(String acctName, String actEmail, String actpswd){
        indexPage = new FirstIndexPage();
        loginPage = indexPage.clickSigninBtn();
        createNewAccountPage = loginPage.createNewAmazonAct();
        createNewAccountPage.createNewAcctThreeParameters(acctName,actEmail,actpswd);
    }

    // 4 Columns
    @Test(dataProvider = "CreateNewWithFourColumns",dataProviderClass = DataProviderAmazon.class)
    public void createNewAccountFourParameters(String acctName, String actEmail, String actpswd, String reEnterpswd){
        indexPage = new FirstIndexPage();
        loginPage = indexPage.clickSigninBtn();
        createNewAccountPage = loginPage.createNewAmazonAct();
        createNewAccountPage.createNewAcctFourParameters(acctName,actEmail,actpswd,reEnterpswd);
    }

}
