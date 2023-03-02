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

    public WebDriver driver;
    By FormAuthentication = By.linkText("Form Authentication");
    By Username = By.cssSelector("input#username");
    By Password = By.cssSelector("input#password");
    By LoginButton = By.cssSelector("[class='fa fa-2x fa-sign-in']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getFormAuthentication(){
        return driver.findElement(FormAuthentication);
    }
    public WebElement getUsername(){
        return driver.findElement(Username);
    }
    public WebElement getPassword(){
        return driver.findElement(Password);
    }
    public WebElement getLoginButton(){
        return driver.findElement(LoginButton);
    }

    public void doLogin(String email, String password) {


        getFormAuthentication().click();
        getUsername().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
    }


}
