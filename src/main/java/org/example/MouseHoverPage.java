package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class MouseHoverPage extends BasePage{

    public WebDriver driver;

    By HoverOption = By.cssSelector("[href='\\/hovers']");
    By UserIcons = By.cssSelector("div > img[alt='User Avatar']");
    By UserInfos = By.cssSelector("div > .figcaption > h5");


    public MouseHoverPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getHoverPage(){
        return driver.findElement(HoverOption);
    }
    public List<WebElement> getUserIcons(){
        return driver.findElements(UserIcons);
    }
    public List<WebElement> getUserInfos(){
        return driver.findElements(UserInfos);
    }


    public void HoverOverToImage() {
        WebDriverWait wait = new WebDriverWait(driver,0);
        getHoverPage().click();
        int i = 0;
        for (WebElement element : getUserIcons()) {
            Actions mouseHover = new Actions(driver);
            mouseHover.moveToElement(element).pause(10).perform();
            wait.until(ExpectedConditions.visibilityOf(getUserInfos().get(i)));
            Assert.assertTrue(getUserInfos().get(i).isDisplayed());
            i++;

        }

    }
}
