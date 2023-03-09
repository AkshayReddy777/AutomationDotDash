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
    public void mouseHoverTest() throws AWTException, InterruptedException {
        mouseHoverPage.hoverOverToImage();
    }

    @AfterMethod
    public void endTest(){
        teardown();
    }
}
