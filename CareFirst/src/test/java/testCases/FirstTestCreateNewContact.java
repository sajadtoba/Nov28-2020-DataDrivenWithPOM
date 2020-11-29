package testCases; // The class is good
import base.TestBase;
import objectPages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FirstTestCreateNewContact extends TestBase {
    IndexPages indexPages;
    LoginPages loginPages;
    HomePages homePages;
    ContactsPages contactsPages;
    CreateNewContact createNewContact;

    @BeforeMethod
    public void setUp() {
        initialization();
        indexPages = new IndexPages();
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void validateCreateNewContact() {
        //indexPages.clickSigninBtn(); // It will land to the LoginPage
        loginPages = indexPages.clickSigninBtn();
        //loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd") ); // It will land to the HomePage
        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
        //homePages.clickOnContactOnHomePage(); // It will land to the contact page
        contactsPages = homePages.clickOnContactOnHomePage();
        //contactsPages.clickTheNewTab(); // It will Land to the Create New Contact
        createNewContact = contactsPages.clickTheNewTab();
        createNewContact.createNewAccout("Tom", "Peter", "M", "Google");
    }

    @Test
    public void validateCreateNew2ndContact() {
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
        contactsPages = homePages.clickOnContactOnHomePage();
        createNewContact = contactsPages.clickTheNewTab();
        createNewContact.createNewAccout("Sajad", "Ak", "S", "Ebay");
    }
    @Test
    public void validateCreateNew3rdContact() {
        loginPages = indexPages.clickSigninBtn();
        homePages = loginPages.enterCredentials(prop.getProperty("email"), prop.getProperty("pswd"));
        contactsPages = homePages.clickOnContactOnHomePage();
        createNewContact = contactsPages.clickTheNewTab();
        createNewContact.createNewAccout("Sumaira", "Akb", "S", "Ebay");
    }
}
