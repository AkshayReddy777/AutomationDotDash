package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;

public class NewWindowPage extends BasePage{

    public WebDriver driver;

    By WindowPage = By.cssSelector("[href='\\/windows']");
    By ClickHereOption = By.cssSelector("div#content  a[target='_blank']");

    By NewWindowText = By.cssSelector("h3");
    public NewWindowPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getWindowPage(){
        return driver.findElement(WindowPage);
    }

    public String getNewWindowText(){
        return driver.findElement(NewWindowText).getText();
    }

    public WebElement getClickHereOption(){
        return driver.findElement(ClickHereOption);
    }

    public void NewWindow(){

        getWindowPage().click();
        getClickHereOption().click();
        ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(1));
    }
}
