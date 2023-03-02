package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContextMenuTest extends BasePage {

    protected ContextMenuPage contextMenuPage;

    @BeforeClass
    public void setUp(){
        driver = getDriver();
        contextMenuPage = PageFactory.initElements(driver, ContextMenuPage.class);
    }

    @Test
    public void testRightClick(){
        contextMenuPage.RightClickOnContextMenuBox();
        Assert.assertEquals(contextMenuPage.AlertMenuText(), "You selected a context menu");
        driver.switchTo().alert().accept();
    }

    @AfterClass
    public void EndTest(){
        teardown();
    }

}
