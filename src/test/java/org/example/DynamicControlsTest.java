package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class DynamicControlsTest extends BasePage{

    protected DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        dynamicControlsPage = PageFactory.initElements(driver, DynamicControlsPage.class);
    }
    @Test
    public void testToAddOrRemoveButton(){
        dynamicControlsPage.RemoveOrAddButton();
    }
    @Test
    public void testToEnableOrDisableButton(){
        dynamicControlsPage.EnableTextField();
    }

    @AfterMethod
    public void EndTest(){
        teardown();
    }

}
