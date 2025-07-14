package com.welcomeqa.tests;

import com.welcomeqa.pages.HomePage;
import com.welcomeqa.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHoversSection();
    }

    @Test
    public void HoversTest() {
        new HoversPage(driver).viewNameProfile()
                .verifyUser1("name: user1");

    }
}
