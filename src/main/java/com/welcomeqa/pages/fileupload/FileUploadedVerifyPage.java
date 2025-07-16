package com.welcomeqa.pages.fileupload;

import com.welcomeqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadedVerifyPage extends BasePage {
    public FileUploadedVerifyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example")
    WebElement uploadedFile;
    public FileUploadedVerifyPage verifyFileUploaded() {
        Assert.assertTrue(uploadedFile.isDisplayed());
        return this;
    }

}
