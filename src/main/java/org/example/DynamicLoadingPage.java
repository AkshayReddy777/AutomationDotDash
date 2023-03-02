package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends BasePage {

    public WebDriver driver;
    By DynamicLoadingPage = By.cssSelector("[href='\\/dynamic_loading']");
    By Example2 = By.cssSelector("[href='\\/dynamic_loading\\/2']");
    By StartButton = By.cssSelector("div#start > button");

    By HelloWorldText = By.cssSelector("div#finish > h4");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getDynamicLoadingPage(){
        return driver.findElement(DynamicLoadingPage);
    }
    public WebElement getExample2Page(){
        return driver.findElement(Example2);
    }
    public WebElement getStartButton(){
        return driver.findElement(StartButton);
    }

    public WebElement getHelloWorldText(){
        return driver.findElement(HelloWorldText);
    }
    public void clickStartButton(){

        getDynamicLoadingPage().click();
        getExample2Page().click();
        getStartButton().click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(HelloWorldText));
    }





}
