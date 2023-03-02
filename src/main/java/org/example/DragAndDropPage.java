package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.InputSource;

import java.awt.*;
import java.awt.event.InputEvent;


public class DragAndDropPage extends BasePage {

    public WebDriver driver;

    By DragAndDropPage = By.cssSelector("[href='\\/drag_and_drop']");
    By ElementA = By.cssSelector("div#column-a");
    By ElementB = By.cssSelector("div#column-b");


    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getDragandDropPage(){
        return driver.findElement(DragAndDropPage);
    }

    public WebElement getElementA(){
        return driver.findElement(ElementA);
    }

    public WebElement getElementB(){
        return driver.findElement(ElementB);
    }

    public void DragAndDrop() throws AWTException, InterruptedException {
        getDragandDropPage().click();

            Robot robot = new Robot();
            robot.setAutoDelay(2000);

            // Get size of elements
            org.openqa.selenium.Dimension fromSize = getElementA().getSize();
            System.out.println(fromSize);
            org.openqa.selenium.Dimension toSize = getElementB().getSize();
            System.out.println(toSize);
            org.openqa.selenium.Point toLocation = getElementB().getLocation();
            System.out.println(toLocation);
            Point fromLocation = getElementA().getLocation();
            System.out.println(fromLocation.getX());
            System.out.println(fromLocation.getY());
            System.out.println("Screen Size: " + driver.manage().window().getSize());

            //Make Mouse coordinate centre of element
        toLocation.x += toSize.width / 2;
        toLocation.y += toSize.height / 2 + toSize.height * 2 / 3;
        fromLocation.x += fromSize.width / 2;
        fromLocation.y += fromSize.height / 2 + fromSize.height * 2 / 3;

            // Click first on screen
            robot.mouseMove(fromLocation.x,fromLocation.y);
            robot.mousePress(InputEvent.BUTTON1_MASK);

            robot.mouseMove(fromLocation.x, fromLocation.y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            //Move to final position
            robot.mouseMove(toLocation.x, toLocation.y);

            //Drop
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }

}
