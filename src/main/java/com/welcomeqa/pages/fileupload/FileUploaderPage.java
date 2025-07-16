package com.welcomeqa.pages.fileupload;

import com.welcomeqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploaderPage extends BasePage {
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement chooseFile;
    public FileUploaderPage chooseFile(String path) {
        chooseFile.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement fileUpload;
    public FileUploaderPage uploadFile() {
        click(fileUpload);
        return this;
    }



}
