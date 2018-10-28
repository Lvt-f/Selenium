package com.handle;

import com.base.DriverBase;
import com.page.loginPage;

/**
 * 操作层
 * */
public class loginPageHandle {
    public DriverBase driver;
    public loginPage lp;
    public loginPageHandle(DriverBase driver){
        this.driver = driver;
        lp = new loginPage(driver);
    }
    /**
     * 输入用户名
     * **/
    public void sendKeysUser(String username){
        lp.sendKeys(lp.getUserElement(),username);
    }
    /**
    * 输入密码
    * **/
    public void sendKeysPassword(String password){
        lp.sendKeys(lp.getPasswordrElement(),password);
    }
    /**
     * 点击登陆
     * **/
    public void clickLoginButton(){
        lp.click(lp.getLoginButtonElement());
    }
    /**
     * 点击自动登陆
     * **/
    public void clikAutoSignin(){
        lp.click(lp.getLoginSigninElement());
    }
    /***
     * 判断是否是登陆界面
     * */
    public boolean assertLoginPage(){
        return lp.assertElementIs(lp.getUserElement());
    }

































}
