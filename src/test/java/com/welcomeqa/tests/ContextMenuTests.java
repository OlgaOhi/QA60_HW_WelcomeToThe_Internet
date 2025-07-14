package com.welcomeqa.tests;

import com.welcomeqa.pages.ContextMenuPage;
import com.welcomeqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getContextMenu();
    }
    @Test
    public void contextMenuTest() {
        new ContextMenuPage(driver).rightClickInBox()
                .verifyJSAlert();
    }
}
