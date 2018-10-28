package com.handle;

import com.base.DriverBase;
import com.page.CoursePage;
import org.openqa.selenium.WebElement;

public class CoursePageHandle {
    public DriverBase driver;
    public CoursePage coursePage;
    public CoursePageHandle(DriverBase driver){
        this.driver =driver;
        coursePage = new CoursePage(driver);
    }
    /**
     * 点击立即购买按钮
     * */
    public void clickBuyNow(){
        coursePage.click(coursePage.getBuytriggerElement());
    }
    /**
     * 点击添加购物车按钮
     * */
    public void clickAddCart(){
        coursePage.click(coursePage.getAddCartElement());
    }
    /**
     * 点击已经购买弹窗的定位按钮
     * */
    public void clickReadBuy(){
        coursePage.click(coursePage.getReadyBUy());
    }
    /**
     * 点击右上角购物车
     * */
    public void clickShopCart(){
        coursePage.click(coursePage.getShopCartElement());
    }
    /**
     * 获取购物车数量
     * */
    public String getShopCarNum(){
        WebElement element = coursePage.getShopCartNumElement();
        return coursePage.getText(element);
    }
    /**
     * 获取课程名称
     * */
    public String getCourseName(){
        WebElement element = coursePage.getCourseNameElement();
        return coursePage.getText(element);
    }















}
