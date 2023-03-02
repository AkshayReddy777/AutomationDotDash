package org.example;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class FileDownloadTest extends BasePage{

    protected FileDownloadPage fileDownloadPage;

    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        fileDownloadPage = PageFactory.initElements(driver, FileDownloadPage.class);
    }

    @Test
    public void FileDownloadTest(){
        Assert.assertEquals(fileDownloadPage.FileDownload(),"C:\\Users\\Admin\\Downloads\\some-file");
    }

    @AfterMethod
    public void EndTest(){
        teardown();
    }
}
