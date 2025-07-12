package com.welcomeqa.tests;

import com.welcomeqa.pages.HomePage;
import com.welcomeqa.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHorizontalSlider("value");
        new HorizontalSliderPage(driver);
    }

    @Test
    public void searchHorizontalSlider() {
        new HorizontalSliderPage(driver).moveSliderHorizontal()
                .verifySliderValue("5");
    }

}
