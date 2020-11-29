package util;

import base.TestBase;
public class TestUtil extends TestBase {
    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 20;
    public static String TESTDATA_SHEET_PATH = "/Users/abc/IdeaProject/SactionScreening/Generic/src/main/java/testData/FreeCrmTes.xlsx";

    public void switchToFrame(){
        driver.switchTo().frame("main Panel");
        }
}