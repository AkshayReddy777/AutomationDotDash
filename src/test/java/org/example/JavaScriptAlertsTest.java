package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class JavaScriptAlertsTest extends BasePage{

    protected JavaScriptAlertsPage javaScriptAlertsPage;

    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        javaScriptAlertsPage = PageFactory.initElements(driver, JavaScriptAlertsPage.class);
    }

    @Test
    public void JSAlertTest(){

        Assert.assertEquals(javaScriptAlertsPage.JSAlertClick(),"You successfuly clicked an alert");
    }
    @Test
    public void JSConfirmTest(){

        Assert.assertEquals(javaScriptAlertsPage.JSConfirmClick(),"You clicked: Ok");
    }
    @Test
    public void JSPromptTest(){

        Assert.assertEquals(javaScriptAlertsPage.JSPromptClick(),"You entered: text message");
    }

    @AfterMethod
    public void EndTest(){
        teardown();
    }
}
