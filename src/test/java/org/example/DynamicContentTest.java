package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class DynamicContentTest extends BasePage {

    protected DynamicContentPage dynamicContentPage;

    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        dynamicContentPage = PageFactory.initElements(driver, DynamicContentPage.class);
    }

    @Test
    public void DynamicContentTests(){

        dynamicContentPage.VerifyDynamicContent();
        Assert.assertNotEquals(dynamicContentPage.beforeChangeText1,dynamicContentPage.afterChangeText1);
        Assert.assertNotEquals(dynamicContentPage.beforeChangeText2,dynamicContentPage.afterChangeText2);
        Assert.assertNotEquals(dynamicContentPage.beforeChangeText3,dynamicContentPage.afterChangeText3);
    }
    @AfterMethod
    public void EndTest(){
        driver.quit();
    }
}
