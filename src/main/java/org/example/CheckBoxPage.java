package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {
    public WebDriver driver;

    By Checkboxes = By.cssSelector("li:nth-of-type(6) > a");
    By checkbox1 = By.cssSelector("form#checkboxes > input:nth-of-type(1)");
    By checkbox2 = By.cssSelector("form#checkboxes > input:nth-of-type(2)");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCheckBoxPage(){
        return driver.findElement(Checkboxes);
    }
    public WebElement getcheckbox1(){
        return driver.findElement(checkbox1);
    }
    public WebElement getcheckbox2(){
        return driver.findElement(checkbox2);
    }

    public void NavigateCheckBoxPage(){
        getCheckBoxPage().click();
    }
    public void clickCheckbox1(){
        getcheckbox1().click();
    }
    public void clickCheckbox2(){
        getcheckbox2().click();
    }

}
