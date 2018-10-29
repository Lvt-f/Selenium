package com.page;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderPayPage extends BasePage{
    public OrderPayPage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取订单号element
     * */
    public WebElement getOrderNumElement(){
        return nodeElement(getByLocator.getLocator("left"),getByLocator.getLocator("order1"));
    }
    /**
     *返回课程名称element
     * **/
    public WebElement getOrderCourseNameElement(){
        return nodeElement(getByLocator.getLocator("orderCourse"),getByLocator.getLocator("orderCOurseNode"));
    }
    /**
     * 返回支付宝element
     * */
    public WebElement getAlipayElement(){
        WebElement element = element(getByLocator.getLocator("clearfix"));
        List<WebElement> elements =element.findElements(getByLocator.getLocator("li"));
        System.out.println(elements.get(1));
        return elements.get(1);
    }
    /**
     * 获取点击立即支付element
     * */
    public WebElement getOrderPayElement(){
        return element(getByLocator.getLocator("orderpay"));
    }




























































}
