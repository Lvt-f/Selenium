package com.business;

import com.base.DriverBase;
import com.handle.OrderPayPageHandle;

public class orderPayPagePro {

    public DriverBase driver;
    public OrderPayPageHandle orderPayPageHandle;
    public orderPayPagePro(DriverBase driver){
        this.driver = driver;
        orderPayPageHandle = new OrderPayPageHandle(driver);
    }
    /**
     * 根基课程、订单判断跳转到支付界面
     * **/
    public void orderPayPro(){

        orderPayPageHandle.clickAliPay();
        driver.RollDown();
        orderPayPageHandle.clickPayElement();

//        String orderName = orderPayPageHandle.getOrderName();
//        String courseName =orderPayPageHandle.getOrderCourseName();
//        if(orderName!=null && courseName!=null){
//            orderPayPageHandle.clickAliPay();
//            orderPayPageHandle.clickPayElement();
//        }
    }






































}
