package com.welcomeqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement horizontalSliderPage;
    public HorizontalSliderPage getHorizontalSlider(String value) {
        click(horizontalSliderPage);
        return new HorizontalSliderPage(driver);
    }
}
