package com.tmb.utils;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitType;
import com.tmb.reports.ExtentLogger;
import org.bouncycastle.est.ESTServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
    public static void click(By by,String elementName) {
        WebElement element = waitUntilElementPresent(by);
        element.click();
        ExtentLogger.pass(elementName+"is clicked..");

    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void click(WebElement element) {
        element.click();
    }




    public static void click(By by, WaitType waitType) {

        WebElement element = null;
        if (waitType == WaitType.PRESENCE) {
            element= waituntilElementPresent(by);
        }else if ((waitType== WaitType.CLICKABLE)){
            element= waitUntilElementToBeClickable(by);

        }


        /*if (waitStrategy.equalsIgnoreCase("present")) {
            element = waituntilElementPresent(by);
        } else if (waitStrategy.equalsIgnoreCase("clickable")) {
            element = waituntilElementPresent(by);
        }*/
        element.click();
    }

    public static void sendkeys(By by, String value, String elemetName) {
        WebElement element = waituntilElementPresent(by);
        element.sendKeys(value);
        ExtentLogger.pass(value+"is ent..");
    }

    private static WebElement waituntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }




  private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable( by));

    }

}

