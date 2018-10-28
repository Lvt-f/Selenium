package com.testCase;

import com.base.DriverBase;
import com.business.CoursePagePro;
import com.business.LoginPro;
import com.business.SureOrderPagePro;
import com.business.orderPayPagePro;
import org.testng.annotations.Test;
import java.util.logging.Logger;


public class loginTest extends CaseBase{

    public DriverBase driver;
    public LoginPro loginPro;
    public CoursePagePro cpp;
    public SureOrderPagePro sopp;
    public orderPayPagePro opp;

    static Logger logger = Logger.getLogger(String.valueOf(loginTest.class));

    public loginTest(){
        //传入浏览器
        this.driver =InitDriver("chrome");
        loginPro = new LoginPro(driver);
        cpp =new CoursePagePro(driver);
        sopp =new SureOrderPagePro(driver);
        opp=new orderPayPagePro(driver);
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
    /**
     * 登陆流程
     * */
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLigin(){
        //logger.info("11111");
        loginPro.login("13780648319","feige6688");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("http://coding.imooc.com/class/74.html");
    }
    /**
    * 添加购物车
    * */
    @Test(dependsOnMethods = "testLigin")
    public void TestAddCart(){
        cpp.addCart();
    }
    /**
     * 立即购买
     * */
    @Test(dependsOnMethods = "testLigin")
    public void TestBuyNow(){
        cpp.buyNow();
    }
    /**
     * 提交订单
     * */
    @Test(dependsOnMethods = "TestBuyNow")
    public void TestSureOrder() throws InterruptedException {
        Thread.sleep(3000);
        sopp.sureOrder();
    }
    /**
     * 跳转支付界面
     * */
    @Test(dependsOnMethods = "TestSureOrder")
    public void testGoPay(){
        opp.orderPayPro();
    }





















}

