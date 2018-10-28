package com.page;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.WebElement;

public class CoursePage extends BasePage{

    public CoursePage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取立即购买按钮element
     * **/
    public WebElement getBuytriggerElement(){
        return element(getByLocator.getLocator("buyNow"));
    }
    /**
     * 获取添加购物车element
     * **/
    public WebElement getAddCartElement(){
        return element(getByLocator.getLocator("addCart"));
    }
    /**
     * 获取右上角购物车element
     * */
    public WebElement getShopCartElement(){
        return element(getByLocator.getLocator("shopCart"));
    }
    /**
     * 获取购物车数量element
     * */
    public WebElement getShopCartNumElement(){
        return element(getByLocator.getLocator("cartNum"));
    }
    /**
     * 获取课程详情页面左上角课程名element
     *
     * */
    public WebElement getCourseNameElement(){

        return nodeElement(getByLocator.getLocator("courseInfo"),getByLocator.getLocator("courseInfoTest"));
    }

}
