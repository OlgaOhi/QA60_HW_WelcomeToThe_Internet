package com.welcomeqa.tests;

import com.welcomeqa.pages.DragAndDropPage;
import com.welcomeqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectDragAndDrop();
    }

    @Test
    public void actionDragAndDrop(){
        new DragAndDropPage(driver).actionDragAndDropElement()
                .verifyDragAndDrop("A");

    }
}
