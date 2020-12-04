package methodsOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDropdownWithoutUsingSelectClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/SactionScreening/Generic/src/driver/chromedriver");
       driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demo.automationtesting.in/Register.html");

        //1) We need to find the element

//        WebElement skillsDropDown = driver.findElement(By.id("Skills"));
//        // 2) perform the click method
//        skillsDropDown.click();
//        // 3)
//        //driver.findElement(By.cssSelector("#Skills>option")); // we do not have one we have 78 so we need to store inside the List
//        List<WebElement> eleList = driver.findElements(By.cssSelector("#Skills>option"));
//
//        for(WebElement skill: eleList){    // Create new element name is skill
// //skill.getText().equals("java") // i need to get the text java  so we need to use the condition
////We need to put the condition that my loop will continue until find the Java and as it found the Java then break the loop.
//            if (skill.getText().equals("Java")) {
//                skill.click(); // As we find then we can break the loop we do not to go further any more loop
//                break;
//            }


//            WebElement countryDropDown = driver.findElement(By.cssSelector("#countries"));
//            countryDropDown.click();
//            //driver.findElement(By.cssSelector("#countries > option")); // But we have List  1- 251 countries
//        List<WebElement> elementList = driver.findElements(By.cssSelector("#countries>option"));
//        // Now we have the list and we can use the for loop
//
//        for(WebElement country: elementList) {
//            // We can use the condition
//
//            if(country.getText().equals("Australia")) {
//                country.click();
//                break;
//            }
//        }

        // For the next code for the year drop down:
        //driver.findElement(By.id("yearbox"));  // we need to put inside the element
//        WebElement year = driver.findElement(By.id("yearbox"));
//        year.click();
//
//        //driver.findElement(By.cssSelector("#yearbox>option"));
//
//        List<WebElement> eleList = driver.findElements(By.cssSelector("#yearbox>option"));
//
//        for (WebElement yearNeed : eleList) {
//
//            if (yearNeed.getText().equals("1919")) {
//                yearNeed.click();
//                break;
//            }
//        }

        // Now we can call out this method

               //selectDropDownValue("//*[@id='yearbox']","//*[@id='yearbox']/option","1919");

        /** Another way to make the code more nice way by creating the 3 variables and then pass the value of these variables  */

        String dropdownYear = "//*[@id='yearbox']";
        String dropDownYearValue = "//*[@id='yearbox']/option";
        String valueOfYear = "1919";
        selectDropDownValue(dropdownYear,dropDownYearValue,valueOfYear);

        /** for the skill      */

        String dropdownSkill = "//*[@id='Skills']";
        String dropDownSkillValue = "//*[@id='Skills']/option";
        String valueOfSkill = "Java";
        selectDropDownValue(dropdownSkill,dropDownSkillValue,valueOfSkill);




    }





        // We can create a method to avoid each time a lot of codes
        // we have 3 dynamic value and we can create a parameters for these 3 dynamic contents
        //1) String dropdown which dropdown we are going to starts from
        //2) String dropdownValue
        //3) String value   the value we want


        public static void selectDropDownValue(String dropDown, String dropDownValue, String value){
            WebElement dropDownWebElement = driver.findElement(By.xpath(dropDown));
            dropDownWebElement.click();

            //driver.findElement(By.cssSelector("#yearbox>option"));

//            List<WebElement> eleList = driver.findElements(By.xpath(dropDownValue)); // just giving the generic names
            List<WebElement> webElementValues = driver.findElements(By.xpath(dropDownValue));


            //for (WebElement yearNeed : webElementValues) { // just changing the generic names
                for (WebElement webElementValue : webElementValues) {

                if (webElementValue.getText().equals(value)) {
                    webElementValue.click();
                    break;
                }
            }






        }

        // 2nd Example for the country

         // #countries>option







    }










