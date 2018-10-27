package com.util;

import com.mushihsi.baseDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



public class TestNgListenerScreen extends TestListenerAdapter {
    //ITestResult运行当前case的对象
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("这是测试方法执行错误");
        super.onTestFailure(iTestResult);
        tackScreenShot(iTestResult);
    }
    /**
     * 传递的作用
     * */
    private void tackScreenShot(ITestResult iTestResult){
       baseDriver b = (baseDriver) iTestResult.getInstance();
        b.tackScreenShot();
    }


    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        super.onTestSuccess(iTestResult);
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        super.onTestSkipped(iTestResult);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        super.onStart(iTestContext);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        super.onFinish(iTestContext);
    }
}
