package com.testCase;

import com.base.DriverBase;
import com.business.LoginPro;
import com.util.ProUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuiteTestLogin extends CaseBase{
    public DriverBase driver;
    public LoginPro loginPro;
    public ProUtil pro;

    @BeforeClass
    public void SuiteTest(){
        this.driver =InitDriver("chrome");
        pro =new ProUtil("loginTest.properties");
        driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPro = new LoginPro(driver);
        driver.get(pro.getPro("url"));
    }
    /**
     * 1.读取数据库
     * 2。读取xml
     * 3。读取配置文件
     * **/
    @Test
    public void testLogin(){
        String username=pro.getPro("username");
        String pass=pro.getPro("passwd");
        loginPro.login(username,pass);

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
/***
 * 判断是否登陆成功
 * */











}














