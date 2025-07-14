package com.welcomeqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage{
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;
    public ContextMenuPage rightClickInBox() {
        new Actions(driver).contextClick(hotSpot).perform();
        return this;
    }

    public ContextMenuPage verifyJSAlert() {
        driver.switchTo().alert().accept();
        return this;
    }
}
