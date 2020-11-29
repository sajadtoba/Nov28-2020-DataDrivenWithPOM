package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

    public class TestBaseAmazon {
        public static WebDriver driver; // Global variable
        public static Properties prop; // Global variable
        // created the constructor of the TestBase Class and then put inside try and catch along with the FileInputstream to read the properties
        public TestBaseAmazon() {
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream("/Users/abc/IdeaProject/SactionScreening/Generic/src/main/java/config/config.properties");
                prop.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Create one Initialization () method

        //public static void initialization(){
        public void initialization(){
            //prop.getProperty("browser");
            String browserName = prop.getProperty("browser"); // "browser" this is the key which we got from the config.properties file
            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
                driver= new ChromeDriver(); // this is called initialized the Global variable
            } else if(browserName.equals("FF")){
                System.setProperty("webdriver.gecko.driver","/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // After creating the separate TestUtil class and inside the variables

            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

            // My url is in the config.properties so we need to read the properties , What should we need to do?
            // We need to read the property by using the getproperty method
            //prop.getProperty("url");  // use double qutotion copy and paste the exact name what we had given into the config.properties
            //**************  driver.get(prop.getProperty("url"));
            driver.get(prop.getProperty("urlAmazon"));

            //Log.info("app url is:"+prop.getProperty("url"));
        }
}
