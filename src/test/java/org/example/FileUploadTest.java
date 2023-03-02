package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadTest extends BasePage {


    protected FileUploadPage fileUploadPage;

    @BeforeTest
    public void setUp(){
        driver = getDriver();
        fileUploadPage = PageFactory.initElements(driver, FileUploadPage.class);
    }

    @Test
    public void FileUploadTest(){
        fileUploadPage.getFileUploadPage();
        fileUploadPage.UploadFile();
        Assert.assertEquals(fileUploadPage.getFileUploadedMessage().getText(),"File Uploaded!");
    }

    @AfterTest
    public void EndTest(){
        teardown();
    }

}
