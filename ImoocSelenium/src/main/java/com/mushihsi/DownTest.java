package com.mushihsi;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownTest {

    public DriverBase driver;

    /**
     * 下单流程
     * */
    //@Test(dependsOnMethods = "testLigin")
    public void downOrder(){
        driver.get("http://coding.imooc.com/class/105.html");
        String currentText =this.buyCourseNow();
        System.out.println("当前课程信息"+currentText);
        this.sureOrder();
        this.getOrder();
        String orderCourseText= this.getOrderCourse();
        System.out.println("当前页面课程信息"+orderCourseText);
        if(currentText.equals(orderCourseText)){
            System.out.println("下单成功");
        }
    }

    /**
     * 获取父element
     * */
    public WebElement getElement(By by){
        return driver.findElement(by);
    }
    /**
     * 通过父节点，获取子节点
     * */
    public WebElement getElement(WebElement element,By by){
        return element.findElement(by);
    }
    /**
     * 获取课程信息
     * */
    public String getCourseTest(WebElement element){
        return element.getText();
    }
    /**
     * 立即购买，然后返回课程信息
     * */
    public String buyCourseNow(){
        //父节点
        WebElement element = this.getElement(getByLocator.getLocator("courseInfo"));
        //子节点
        WebElement elementNode=this.getElement(element,getByLocator.getLocator("courseInfoTest"));
        //获取courseTest信息
        String currenttest = this.getCourseTest(elementNode);
        driver.click(this.getElement(getByLocator.getLocator("buyNow")));
        return currenttest;
    }
    /**
     * 点击确定订单
     * **/
    public void sureOrder(){
        driver.click(this.getElement(getByLocator.getLocator("sureOrder")));
    }
    /**
     *  获取订单号text
     * **/
    public String getOrder(){
        String orderText =this.getCourseTest(this.getElement(getByLocator.getLocator("order")));
        return orderText;
    }
    /**
     * 获取支付中心的商品信息
     * */
    public String getOrderCourse(){
        //父节点
        WebElement element =this.getElement(getByLocator.getLocator("orderCourse"));
        //子节点
        WebElement elementNode=this.getElement(element,getByLocator.getLocator("orderCOurseNode"));
        return this.getCourseTest(elementNode);
    }

}
