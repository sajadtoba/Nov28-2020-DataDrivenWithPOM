package testCases;

import base.TestBase;
import objectPages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.TestUtil;


public class TestCreateNewContact extends TestBase {

    IndexPages indexPages;
    LoginPages loginPages;
    HomePages homePages;
    ContactsPages contactsPages;
    CreateNewContact createNewContact;

    @BeforeMethod
    public void setUp() {
        initialization();
        indexPages = new IndexPages();
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
        contactsPages = homePages.clickOnContactOnHomePage();
        createNewContact = contactsPages.clickTheNewTab();
        String sheetName = "contacts";

    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }


    @Test
    public void validateCreate1stNewContact() {
        createNewContact.createNewAccout("Tom", "Peter", "M", "Google");
    }

    @Test
    public void validateCreateNew2ndContact() {
        createNewContact.createNewAccout("Sajad", "Ak", "S", "Ebay");
    }

    @Test
    public void validateCreateNew3rdContact() {
        createNewContact.createNewAccout("Sumaira", "Akb", "S", "Ebay");
    }

    @Test
    public void validateCreateNew4thContact() {
        createNewContact.createNewAccout("Marjina", "Akthar", "M", "Amazon");
    }

    @Test
    public void validateCreateNew5thContact() {
        createNewContact.createNewAccout("Muhammad", "Sheikh", "N", "Amazon");
    }
}


