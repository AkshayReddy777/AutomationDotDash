package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class NotificationMessageTest extends BasePage{

    protected NotificationMessagePage notificationMessagePage;
    @BeforeClass
    public void setUp(){
        driver = getDriver();
        notificationMessagePage = PageFactory.initElements(driver, NotificationMessagePage.class);
    }
    @Test
    public void NotificationTest(){
        notificationMessagePage.NotificationMessageAction();
        Assert.assertTrue(notificationMessagePage.arrayContainsString(notificationMessagePage.NotificationMessageArray(),notificationMessagePage.getNotificationMessage()));
    }


    @AfterMethod
    public void EndTest(){
        teardown();
    }

}
