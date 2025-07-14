package com.welcomeqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "dropdown")
    WebElement dropDownElement;
    public DropDownPage clickOnDropDown() {
        new DropDownPage(driver).click(dropDownElement);
        return this;
    }

    public DropDownPage SelectOption1(String text) {
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByVisibleText(text);
        return this;
    }

    public DropDownPage verifyText(String expectedText) {
        String actualText = new Select(dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals(actualText, expectedText);
        return this;
    }
}
