package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.driver.DriverManager;
import com.tmb.pages.LoginPage;
import com.tmb.testdata.TestData;
import com.tmb.utils.DataProviderUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PaymentTest extends BaseTest{
@FrameworkAnnotation
    @Test(description = "To check...",dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
    public void test2(TestData testData){
       // DriverManager.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin");
       // DriverManager.getDriver().findElement(By.id("txtPassword")).sendKeys("admin123");
        //DriverManager.getDriver().findElement(By.id("btnLogin")).click();
    LoginPage loginPage = new LoginPage();
    loginPage.loginToApplication("abbd", "ooooou");

        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");
    }
}
