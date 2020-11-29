package testCases;

import base.TestBaseAmazon;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstIndexPage;
import pageObjects.SecondSearchResultPage;

public class TestSearchPageWithDataProvider extends TestBaseAmazon {
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

    // Before make any changes

    //  @Test
    //    public void testSearch1stItem(){
    //        indexPage = new FirstIndexPage();
    //        //indexPage.searchItemsOnIndexPage("iphone");
    //        resultPage =indexPage.searchItemsOnIndexPage("iphone");
    //    }

    /**
     * Test is running successfully with the Data provider method Made 3 changes
     * 1st changes inside the @Test annotation  //*****************************************@Test
     * 2nd Changes we need to make method with signature/parameters according to the Excelsheet columns
     * //*************************************    // public void testSearch1stItem(String searchItem){
     * 3rd changes instead of Hardcoded code we use use the signature parameters
     * //***********************************      //resultPage =indexPage.searchItemsOnIndexPage("iphone");
     */

    @Test(dataProvider = "search", dataProviderClass = DataProviderAmazon.class)
    public void testSearch1stItem(String searchItem) {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage(searchItem);
    }

    /**
     * Test is running successfully with the Data provider method
     */
    @Test(dataProvider = "AmazonOffice", dataProviderClass = DataProviderAmazon.class)
    public void testSearch2ndItem(String supplyItems) {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage(supplyItems);
    }

    @Test(dataProvider = "HouseStuff", dataProviderClass = DataProviderAmazon.class)
    public void testSearch3rdItem(String needHouseItems) {
        indexPage = new FirstIndexPage();
        //indexPage.searchItemsOnIndexPage("iphone");
        resultPage = indexPage.searchItemsOnIndexPage(needHouseItems);
    }


}
