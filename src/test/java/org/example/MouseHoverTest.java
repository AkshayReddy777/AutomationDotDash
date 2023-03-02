package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.awt.*;

public class MouseHoverTest extends BasePage{

    protected MouseHoverPage mouseHoverPage;

    @BeforeClass
    public void setUp(){
        driver = getDriver();
        mouseHoverPage = PageFactory.initElements(driver, MouseHoverPage.class);
    }
    @Test
    public void MouseHoverTest() throws AWTException, InterruptedException {
        mouseHoverPage.HoverOverToImage();
    }

    @AfterMethod
    public void EndTest(){
        teardown();
    }
}
