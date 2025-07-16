package com.welcomeqa.tests;

import com.welcomeqa.pages.fileupload.FileUploadedVerifyPage;
import com.welcomeqa.pages.fileupload.FileUploaderPage;
import com.welcomeqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploaderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFileUploadSection();
    }

    @Test
    public void fileUploadTest() {
        new FileUploaderPage(driver).chooseFile("/Users/onidat/Desktop/photo_2025-07-12 22.27.33.jpeg");
        new FileUploaderPage(driver).uploadFile();
        new FileUploadedVerifyPage(driver).verifyFileUploaded();
    }
}
