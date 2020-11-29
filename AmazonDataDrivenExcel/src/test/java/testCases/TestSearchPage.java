package testCases;

import base.TestBaseAmazon;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.SecondSearchResultPage;

/**
 * We can run all test even at the same time but first run test from the excel sheet then the other tests run too
 */

public class TestSearchPage extends TestBaseAmazon {
    FirstIndexPage indexPage;
    SecondSearchResultPage resultPage;

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }


    @Test
    public void testSearch1stItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("iphone");
    }

    @Test
    public void testSearch2ndItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("Hp Computer");
    }

    @Test
    public void testSearch3rdItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("Mac book pro");
    }

    @Test
    public void testSearch4thItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("Electric Shaver");
    }

    @Test
    public void testSearch5thItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("Brother Fax machine");
    }

    @Test
    public void testSearch6thItem() {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage("Table lamp");
    }
}





