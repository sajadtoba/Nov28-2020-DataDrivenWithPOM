package testCases;
import java.util.HashMap;
import java.util.Map;
import utlity.ExcelLibrary;

public class DataProviderAmazon {

        ExcelLibrary obj = new ExcelLibrary();

//Class --> LoginPageTest,HomePageTest Test Case--> loginTest, wishListTest, orderHistoryandDetailsTest
        /** 1)    *********************     credentials    ____  CreateAcct  ___       (This is Excelsheet name which I created inside the ExcelSpreetsheet  *****************************/
        @org.testng.annotations.DataProvider(name = "credentials")// DataProvider (name it can be any name but must use the same name inside the Test Class
        public Object[][] getCredentials() {
            // Totals rows count
            int rows = obj.getRowCount("Credentials");
            // Total Columns
            int column = obj.getColumnCount("Credentials");
            int actRows = rows - 1;

            Object[][] data = new Object[actRows][column];

            for (int i = 0; i < actRows; i++) {
                for (int j = 0; j < column; j++) {
                    data[i][j] = obj.getCellData("Credentials", j, i + 2);
                }
            }
            return data;
        }


        /** 2)*******************     email       (This is Excelsheet name which I created inside the ExcelSpreetsheet)                 */

        //Class --> AccountCreationPage  Test Case--> verifyCreateAccountPageTest
        @org.testng.annotations.DataProvider(name = "email")// DataProvider (name it can be any name but must use the same name inside the Test Class
        public Object[][] getEmail() {
            // Totals rows count
            int rows = obj.getRowCount("Email");
            // Total Columns
            int column = obj.getColumnCount("Email");
            int actRows = rows - 1;

            Object[][] data = new Object[actRows][column];

            for (int i = 0; i < actRows; i++) {
                for (int j = 0; j < column; j++) {
                    data[i][j] = obj.getCellData("Email", j, i + 2);
                }
            }
            return data;
        }
        /** 3)*******************     getProduct   (This is Excelsheet name which I created inside the ExcelSpreetsheet)         *****************/
        //Class --> AddToCartPageTest, EndToEndTest,  Test Case--> addToCartTest, endToEndTest
        @org.testng.annotations.DataProvider(name = "getProduct")// DataProvider (name it can be any name but must use the same name inside the Test Class
        public Object[][] getProduct() {
            // Totals rows count
            int rows = obj.getRowCount("ProductDetails");
            // Total Columns
            int column = obj.getColumnCount("ProductDetails");
            int actRows = rows - 1;

            Object[][] data = new Object[actRows][column];

            for (int i = 0; i < actRows; i++) {
                for (int j = 0; j < column; j++) {
                    data[i][j] = obj.getCellData("ProductDetails", j, i + 2);
                }
            }
            return data;
        }

        // Class --> SearchResultPageTest, Test Case--> productAvailabilityTest
        /** 4)*******************  searchProduct      (This is Excelsheet name which I created inside the ExcelSpreetsheet) **/
        @org.testng.annotations.DataProvider(name = "searchProduct")// DataProvider (name it can be any name but must use the same name inside the Test Class
        public Object[][] getProductPrice() {
            // Totals rows count
            int rows = obj.getRowCount("SearchProduct");
            // Total Columns
            int column = obj.getColumnCount("SearchProduct");
            int actRows = rows - 1;

            Object[][] data = new Object[actRows][column];

            for (int i = 0; i < actRows; i++) {
                for (int j = 0; j < column; j++) {
                    data[i][j] = obj.getCellData("SearchProduct", j, i + 2);
                }
            }
            return data;
        }
        /** 5) *******************      newAccountDetailsData     (This is Excelsheet name which I created inside the ExcelSpreetsheet) ****/
        @org.testng.annotations.DataProvider(name = "newAcountDetailsData")// DataProvider (name it can be any name but must use the same name inside the Test Class
        public Object[][] accountCreation() {

            // Totals rows count
            int rows = obj.getRowCount("AccountCreationData");
            // Total Columns
            int column = obj.getColumnCount("AccountCreationData");
            int actRows = rows - 1;
            //Created an object of array to store data
            Object[][] data = new Object[actRows][1];

            for (int i = 0; i < actRows; i++) {
                Map<String, String> hashMap = new HashMap<>();
                for (int j = 0; j < column; j++) {
                    hashMap.put(obj.getCellData("AccountCreationData", j, 1),
                            obj.getCellData("AccountCreationData", j, i + 2));
                }
                data[i][0]=hashMap;
            }
            return data;
        }
        //********************* OfficeSupplies    *******************************************************************************


    /** Sajad trying Search one column)*******************     email       (This is Excelsheet name which I created inside the ExcelSpreetsheet)                 */

    //Class --> AccountCreationPage  Test Case--> verifyCreateAccountPageTest
    @org.testng.annotations.DataProvider(name = "search") // DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getSearch() {
        // Totals rows count
        int rows = obj.getRowCount("search");
        // Total Columns
        int column = obj.getColumnCount("search");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("search", j, i + 2);
            }
        }
        return data;
    }

    /** Sajad trying Search one column)*******************   HouseHoldItems          (This is Excelsheet name which I created inside the ExcelSpreetsheet)                 */

    //Class --> AccountCreationPage  Test Case--> verifyCreateAccountPageTest
    @org.testng.annotations.DataProvider(name = "AmazonOffice")// DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getOfficeSupply() {
        // Totals rows count
        int rows = obj.getRowCount("OfficeSupplies");
        // Total Columns
        int column = obj.getColumnCount("OfficeSupplies");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("OfficeSupplies", j, i + 2);
            }
        }
        return data;
    }

    /** Sajad trying Search one column)*******************   ///   HouseHoldItems my sheet name///          (This is Excelsheet name which I created inside the ExcelSpreetsheet)                 */

    //Class --> AccountCreationPage  Test Case--> verifyCreateAccountPageTest
    @org.testng.annotations.DataProvider(name = "HouseStuff")// DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getHouseItems() {
        // Totals rows count
        int rows = obj.getRowCount("HouseHoldItems");
        // Total Columns
        int column = obj.getColumnCount("HouseHoldItems");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("HouseHoldItems", j, i + 2);
            }
        }
        return data;
    }



    // Two Columns Excelsheet *******************************************

    /** 2Columns successfully  )    *********************     credentials    ____  CreateAcct  ___  CreateAccountThreeParameters      (This is Excelsheet name which I created inside the ExcelSpreetsheet  *****************************/
    @org.testng.annotations.DataProvider(name = "CreateNewAcct")// DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getCreateInfomation() {
        // Totals rows count
        int rows = obj.getRowCount("CreateAcct");
        // Total Columns
        int column = obj.getColumnCount("CreateAcct");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("CreateAcct", j, i + 2);
            }
        }
        return data;
    }


    /** 3 Columns successfully  )    *********************     credentials    ____  CreateAcct  ___  CreateAccountThreeParameters   CreateAccountFourColumns     (This is Excelsheet name which I created inside the ExcelSpreetsheet  *****************************/
    @org.testng.annotations.DataProvider(name = "CreateNewWithThreeColumns")// DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getCreateNewInfomation() {
        // Totals rows count
        int rows = obj.getRowCount("CreateAccountThreeParameters");
        // Total Columns
        int column = obj.getColumnCount("CreateAccountThreeParameters");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("CreateAccountThreeParameters", j, i + 2);
            }
        }
        return data;
    }

    /** 4 Columns successfully  )    *******     credentials    ____  CreateAcct  ___  CreateAccountThreeParameters   CreateAccountFourColumns     (This is Excelsheet name which I created inside the ExcelSpreetsheet  *****************************/
    @org.testng.annotations.DataProvider(name = "CreateNewWithFourColumns")// DataProvider (name it can be any name but must use the same name inside the Test Class
    public Object[][] getCreateNewFourCloumnInfo() {
        // Totals rows count
        int rows = obj.getRowCount("CreateAccountFourColumns");
        // Total Columns
        int column = obj.getColumnCount("CreateAccountFourColumns");
        int actRows = rows - 1;

        Object[][] data = new Object[actRows][column];

        for (int i = 0; i < actRows; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = obj.getCellData("CreateAccountFourColumns", j, i + 2);
            }
        }
        return data;
    }




//*************                            ***************************************              *************









}








