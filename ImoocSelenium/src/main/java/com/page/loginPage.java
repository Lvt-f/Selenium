package com.page;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.WebElement;
/**
 * 定位层
 * */

public class loginPage extends BasePage {
    public loginPage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取用户名输入框
     * */
    public WebElement getUserElement(){
       return element(getByLocator.getLocator("username"));
    }
    /**
     * 获取密码输入框Element
     * */
    public WebElement getPasswordrElement(){
        return element(getByLocator.getLocator("userpass"));
    }
    /**
     * 获取登陆按钮Element
     * */
    public WebElement getLoginButtonElement(){
        return element(getByLocator.getLocator("loginbutton"));
    }
    /**
     * 获取自动登录Element
     * */
    public WebElement getLoginSigninElement(){
        return element(getByLocator.getLocator("autoSignin"));
    }

















}
