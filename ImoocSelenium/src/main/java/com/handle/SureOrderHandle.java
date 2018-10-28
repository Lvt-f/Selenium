package com.handle;

import com.base.DriverBase;
import com.page.SureOrderPage;

public class SureOrderHandle {
    public SureOrderPage sureOrderPage;
    public DriverBase driver;
    public SureOrderHandle(DriverBase driver){
        this.driver =driver;
        sureOrderPage =new SureOrderPage(driver);
    }
    /**
     * 点击确认订单按钮
     * */
    public void clickSubOrderElement(){
        sureOrderPage.click(sureOrderPage.getSubOrderElement());
    }
















}
