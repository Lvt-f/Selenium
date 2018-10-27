package com.business;

import com.base.DriverBase;
import com.page.loginPageHandle;

/**
 * 业务层、具体的操作
 * */
public class LoginPro {
    public loginPageHandle lph;
    public LoginPro(DriverBase driver){
        lph = new loginPageHandle(driver);
    }
    public void login(String username,String password){
        //输入并登陆，但是首先需要判断是否存在
        if(lph.assertLoginPage()){
            lph.sendKeysUser(username);
            lph.sendKeysPassword(password);
            lph.clikAutoSignin();
            lph.clickLoginButton();
        }else {
            System.out.println("页面不存在或者状态不正确");
        }

    }


















}
