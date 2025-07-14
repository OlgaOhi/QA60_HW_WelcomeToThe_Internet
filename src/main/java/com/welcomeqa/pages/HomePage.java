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

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDrop;
    public DragAndDropPage selectDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }

    @FindBy(css = "a[href='/hovers']")
    WebElement hovers;
    public HoversPage getHoversSection() {
        click(hovers);
        return new HoversPage(driver);
    }

    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;
    public ContextMenuPage getContextMenu() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }
}
