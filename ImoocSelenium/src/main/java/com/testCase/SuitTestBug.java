package com.testCase;

import com.base.DriverBase;
import com.business.CoursePagePro;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuitTestBug extends CaseBase {
    public DriverBase driver;
    public CoursePagePro cpp;
    @BeforeClass
    public void beforeClass(){
        this.driver =driver;
        cpp=new CoursePagePro(driver);
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
    @Test
    public void testBuy(){

    }
























































}
