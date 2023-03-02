package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertsPage extends BasePage{

    public WebDriver driver;
    By JavaScriptAlertsPage = By.cssSelector("[href='\\/javascript_alerts']");
    By JSAlertButton = By.cssSelector("[onclick='jsAlert\\(\\)']");
    By JSConfirmButton = By.cssSelector("[onclick='jsConfirm\\(\\)']");
    By JSPrompt = By.cssSelector("[onclick='jsPrompt\\(\\)']");
    By AlertMessage = By.cssSelector("p#result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getJavaScriptAlertsPage(){
        return driver.findElement(JavaScriptAlertsPage);
    }
    public WebElement getJSAlertButton(){
        return driver.findElement(JSAlertButton);
    }
    public WebElement getJSConfirmButton(){
        return driver.findElement(JSConfirmButton);
    }
    public WebElement getJSPrompt(){
        return driver.findElement(JSPrompt);
    }
    public WebElement getAlertMessage(){
        return driver.findElement(AlertMessage);
    }
    public String JSAlertClick(){

        getJavaScriptAlertsPage().click();
        getJSAlertButton().click();
        driver.switchTo().alert().accept();
        return getAlertMessage().getText();
    }

    public String JSConfirmClick(){

        getJavaScriptAlertsPage().click();
        getJSConfirmButton().click();
        driver.switchTo().alert().accept();
        return getAlertMessage().getText();
    }

    public String JSPromptClick(){

        getJavaScriptAlertsPage().click();
        getJSPrompt().click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("text message");
        alert.accept();
        System.out.println(getAlertMessage());
        return getAlertMessage().getText();
    }



}
