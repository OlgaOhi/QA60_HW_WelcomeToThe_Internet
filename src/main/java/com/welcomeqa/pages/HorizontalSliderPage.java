package com.welcomeqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement moveSlider;
    public HorizontalSliderPage moveSliderHorizontal() {
        new Actions(driver).dragAndDropBy(moveSlider,300,0).perform();
        return this;
    }

    @FindBy(id = "range")
    WebElement rangeDisplay;
    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(rangeDisplay.getText(),"5");
        return this;
    }
}

