package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.Password;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;

public class LoginPage extends BasePage {

    protected WebDriver driver;
    By formAuthentication = By.linkText("Form Authentication");
    By username = By.cssSelector("input#username");
    By password = By.cssSelector("input#password");
    By loginButton = By.cssSelector("[class='fa fa-2x fa-sign-in']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getFormAuthentication(){
        return driver.findElement(formAuthentication);
    }
    public WebElement getUsername(){
        return driver.findElement(username);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }

    public void doLogin(String email, String password) {
        getFormAuthentication().click();
        getUsername().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
    }
}
