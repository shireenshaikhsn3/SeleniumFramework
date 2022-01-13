package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;
import com.tmb.reports.ExtentManager;
import com.tmb.testdata.TestData;
import com.tmb.utils.DataProviderUtils;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.openqa.selenium.By;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class HomePageTest extends BaseTest {
        @DataSupplier(runInParallel = true)
        public StreamEx<TestData> getData(Method method){
            return TestDataReader.use(XlsxReader.class).withTarget(TestData.class)
                    .withSource("testdata.xlsx").read().filter(testdata -> testdata.testCaseName.
                            equalsIgnoreCase(method.getName()));

        }
@FrameworkAnnotation
        @Test(description = "To check...",dataProvider = "getData", dataProviderClass = DataProviderUtils.class)

        public void titleValidationTest(TestData testData ){
            //ExtentManager.getExtentTest().assignAuthor("Shireen").assignCategory("smoke").assignAuthor("Regression ");
            LoginPage loginPage = new LoginPage();
            String actualTitle= loginPage.loginToApplication(testData.username, testData.password).getHomePageTitle();
            Assert.assertEquals(actualTitle , testData.expectedTitle);





}

    }

