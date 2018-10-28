package com.business;

import com.base.DriverBase;
import com.handle.SureOrderHandle;

public class SureOrderPagePro {
    public SureOrderHandle sureOrderHandle;
    public DriverBase driver;
    public SureOrderPagePro(DriverBase driver){
        this.driver =driver;
        sureOrderHandle =new SureOrderHandle(driver);
    }
    /**
     * 确定订单按钮
     * */
    public void sureOrder(){
        sureOrderHandle.clickSubOrderElement();
    }














}
