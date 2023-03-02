package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewWindowTest extends BasePage{

    protected NewWindowPage newWindowPage;

    @BeforeClass
    public void setUp(){
        driver = getDriver();
        newWindowPage = PageFactory.initElements(driver, NewWindowPage.class);
    }

    @Test
    public void NewWindowTest(){
        newWindowPage.NewWindow();
        Assert.assertEquals(newWindowPage.getNewWindowText(),"New Window");
    }

    @AfterMethod
    public void EndTest(){
        teardown();
    }
}
