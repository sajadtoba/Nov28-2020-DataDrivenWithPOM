package tests;

import base.TestBaseWalgreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.IndexPageFirst;

public class TestIndexPage extends TestBaseWalgreen {
    IndexPageFirst indexPage;


    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @AfterMethod
    public void cleanUp(){
        //driver.quit();
    }
    @Test
    public void testLogin(){
        indexPage = new IndexPageFirst();
        indexPage.mouseHoveWebelement();
        //indexPage.accountBtn();
    }





}
