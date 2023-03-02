package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage extends BasePage{

    public WebDriver driver;
    By IFramePage = By.cssSelector("[href='\\/frames']");
    By IFrameOption = By.cssSelector("[href='\\/iframe']");

    By TextBoxInFrame = By.cssSelector("body#tinymce > p");


    public IFramePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getIFramePage(){
        return driver.findElement(IFramePage);
    }

    public WebElement getIFrameOption(){
        return driver.findElement(IFrameOption);
    }

    public WebElement getTextBoxInFrame(){
        return driver.findElement(TextBoxInFrame);
    }

    public void IFrameText(){

        getIFramePage().click();
        getIFrameOption().click();
        driver.switchTo().frame("mce_0_ifr");
        getTextBoxInFrame().clear();
        getTextBoxInFrame().sendKeys("Text is sent");
    }


}
