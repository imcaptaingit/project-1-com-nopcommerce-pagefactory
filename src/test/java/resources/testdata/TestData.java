package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {


    @DataProvider(name = "Register details")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Sarvat", "Shaikh", "United Kingdom", "London", "High Road", "EN8 7EF", "9825868472"},

        };
        return data;
    }

}