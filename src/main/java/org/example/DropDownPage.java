package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {

    public WebDriver driver;
    By DropDownPage = By.cssSelector("[href='\\/dropdown']");
    By DropDownSelector = By.cssSelector("select#dropdown");


    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getDropDownPage(){
        return driver.findElement(DropDownPage);
    }

    public WebElement getDropDownSelector(){
        return driver.findElement(DropDownSelector);
    }


    public void selectOption1(){


        getDropDownPage().click();
        Select DropDownSelect = new Select(getDropDownSelector());
        DropDownSelect.selectByVisibleText("Option 1");

    }
    public void selectOption2(){

        getDropDownPage().click();
        Select DropDownSelect = new Select(getDropDownSelector());
        DropDownSelect.selectByVisibleText("Option 2");

    }

    public String getSelectedOption(){
        return new Select(getDropDownSelector()).getFirstSelectedOption().getText();
    }


}
