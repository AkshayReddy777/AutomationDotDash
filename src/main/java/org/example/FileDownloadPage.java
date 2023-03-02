package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class FileDownloadPage extends BasePage {

    public WebDriver driver;

    By FileDownloadPage = By.cssSelector("[href='\\/download']");
    By FileToBeDownloaded = By.cssSelector("[href='download\\/some-file\\.txt']");

    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFileDownloadPage(){
        return driver.findElement(FileDownloadPage);
    }
    public WebElement getFileToBeDownloaded(){
        return driver.findElement(FileToBeDownloaded);
    }

    public String FileDownload(){

        getFileDownloadPage().click();
        getFileToBeDownloaded().click();
        String downloadPath = System.getProperty("user.home");
        System.out.println(downloadPath+"\\Downloads\\some-file.txt");
        File downloadedFile = new File(downloadPath + "\\Downloads\\some-file" );
        System.out.println(downloadedFile.exists());
       //downloadedFile.deleteOnExit();
        System.out.println(downloadedFile.getAbsoluteFile().exists());
        return downloadedFile.getAbsolutePath();
    }
}
