package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TopMenuTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {

        SoftAssert softAssert = new SoftAssert();

        homePage.selectMenu("Computers");
        String expectedText = "Computers";
        softAssert.assertTrue(expectedText == "Computers", "Unable to verify text.");
        softAssert.assertAll();
    }
}
