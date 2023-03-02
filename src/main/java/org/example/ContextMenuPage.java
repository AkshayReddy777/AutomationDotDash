package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    public WebDriver driver;

    By ContextMenu = By.cssSelector("[href='\\/context_menu']");

    By ContextMenuBox = By.cssSelector("div#hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getContextMenu(){
        return driver.findElement(ContextMenu);
    }

    public WebElement getContextMenuBox(){
        return driver.findElement(ContextMenuBox);
    }

    public void RightClickOnContextMenuBox(){
        getContextMenu().click();
        Actions rightclick = new Actions(driver);
        rightclick.contextClick(getContextMenuBox()).perform();
    }
    public String AlertMenuText(){
        String alerttext = driver.switchTo().alert().getText();
        return alerttext;
    }

}
