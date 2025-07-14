package com.welcomeqa.tests;

import com.welcomeqa.pages.DropDownPage;
import com.welcomeqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropDownSection();
    }
    @Test
    public void contextMenuTest() {
        new DropDownPage(driver).clickOnDropDown().SelectOption1("Option 1")
                .verifyText("Option 1");
    }

}
