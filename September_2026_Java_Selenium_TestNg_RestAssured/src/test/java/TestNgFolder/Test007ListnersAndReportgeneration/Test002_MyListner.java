package TestNgFolder.Test007ListnersAndReportgeneration;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test002_MyListner implements ITestListener {
    public void onStart(ITestContext context) {
        System.out.println("Test Execution is going to start ");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test  Started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("TestSkipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test Execution completed");
    }

}
