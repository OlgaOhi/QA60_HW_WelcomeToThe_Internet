package com.welcomeqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='figure'][1]")
    WebElement nameUser1;
    public HoversPage viewNameProfile() {
        new Actions(driver).moveToElement(nameUser1).perform();
        return this;
    }

    @FindBy(xpath = "//h5[text()='name: user1']")
    WebElement user1;
    public HoversPage verifyUser1(String text) {
        Assert.assertEquals(user1.getText(),text);
        return this;
    }
}
