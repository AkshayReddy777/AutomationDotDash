package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver.manage().window().maximize();
        driver.get(geturl());
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    public String geturl(){
        String url = "http://localhost:7080";
        return url;
    }
    public void teardown(){
        driver.close();
        driver.quit();
    }

}
