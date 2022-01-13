package com.tmb.listenerss;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentReport;
import org.testng.ITestListener;

import java.util.Arrays;

public class TestListeners implements ITestListener {
    @Override
   public void onTestStart(org.testng.ITestResult result) { ExtentReport.createTest(result.getMethod().getDescription());
    ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod()
            .getAnnotation(FrameworkAnnotation.class).author());}
    @Override
    public void onTestSuccess(org.testng.ITestResult result) {
        ExtentLogger.pass(result.getName()+"is passed ");
    }
    @Override
    public void onTestFailure(org.testng.ITestResult result) { ExtentLogger.fail(result.getName()+"is failed ");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }
    @Override
    public void onStart(org.testng.ITestContext context) { ExtentReport.initReports();}
    @Override

    public void onFinish(org.testng.ITestContext context) {
        ExtentReport.flushReports();
    }

}
