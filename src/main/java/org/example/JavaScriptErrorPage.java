package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.window;

public class JavaScriptErrorPage extends BasePage{

    public WebDriver driver;

    By JSErrorPage = By.cssSelector("[href='\\/javascript_error']");
    public JavaScriptErrorPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getJSErrorPage(){
        return driver.findElement(JSErrorPage);
    }
    public List<String> JSErrorCheck() throws InterruptedException {
        List<String> errorMessages = new ArrayList<String>();
        List<String> message = new ArrayList<String>();
        message.add("no error");

        getJSErrorPage().click();
        LogEntries jserrors = driver.manage().logs().get(LogType.BROWSER);
        if(jserrors != null) {
            for (LogEntry error : jserrors) {
                System.err.println(error.getMessage());
                errorMessages.add(error.getMessage());
            }
            return errorMessages;
        }
        return message;
    }

}

