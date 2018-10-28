package com.handle;

import com.base.DriverBase;
import com.page.OrderPayPage;

public class OrderPayPageHandle {
    public DriverBase driver;
    public OrderPayPage orderPayPage;
    public OrderPayPageHandle(DriverBase driver){
        this.driver =driver;
        orderPayPage =new OrderPayPage(driver);
    }
    /**
     * 获取订单文字
     * */
    public String getOrderName(){
        return orderPayPage.getText(orderPayPage.getOrderNumElement());
    }
    /**
     * 获取课程名称
     * */
    public String getOrderCourseName(){
        return orderPayPage.getText(orderPayPage.getOrderCourseNameElement());
    }
    /**
     * 点击支付宝支付
     * **/
    public void clickAliPay(){
        orderPayPage.click(orderPayPage.getAlipayElement());
    }
    /**
     * 点击立即支付
     * **/
    public void clickPayElement(){
        orderPayPage.click(orderPayPage.getOrderPayElement());
    }


































}
