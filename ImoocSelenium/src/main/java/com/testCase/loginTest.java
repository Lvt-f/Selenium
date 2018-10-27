package com.testCase;

import com.base.DriverBase;
import com.business.LoginPro;
import com.util.TestNgListenerScreen;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.logging.Logger;

@Listeners(TestNgListenerScreen.class)
public class loginTest extends CaseBase{

    public DriverBase driver;
    public LoginPro loginPro;

    static Logger logger = Logger.getLogger(String.valueOf(loginTest.class));

    public loginTest(){
        //传入浏览器
        this.driver =InitDriver("chrome");
        loginPro = new LoginPro(driver);
    }
    @Test
    public void getLoginHome(){
        //调用在driverBase下的方法
        //driver.get("http://www.imooc.com");
        driver.get("https://www.imooc.com/user/newlogin/from_url/");
        //driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLigin(){
        logger.info("11111");
        loginPro.login("13780648319","feige6688");
    }














}
