package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FloatingMenuPage extends BasePage{

    public WebDriver driver;
    By FloatingMenuPage = By.cssSelector("[href='\\/floating_menu']");
    By HomeIcon = By.cssSelector("[href='\\#home']");
    By ContactIcon = By.cssSelector("[href='\\#contact']");

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFloatingMenuPage(){
        return driver.findElement(FloatingMenuPage);
    }
    public WebElement getHomeIcon(){
        return driver.findElement(HomeIcon);
    }
    public WebElement getContactIcon(){
        return driver.findElement(ContactIcon);
    }

    public void ScrollPage(){


        getFloatingMenuPage().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }

}
