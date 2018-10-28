package com.business;

import com.base.DriverBase;
import com.handle.CoursePageHandle;

public class CoursePagePro {
    public DriverBase driver;
    public CoursePageHandle coursePageHandle;
    public CoursePagePro(DriverBase driver){
        this.driver = driver;
        coursePageHandle = new CoursePageHandle(driver);
    }
    /**
     * 添加购物车
     * */
    public void addCart(){
        //原本购物车的数量
        int beforeNum = 0;
        int afterNum;
        //添加了内容后购物车的数量
        String aftercourseNum;
        String courseNum = coursePageHandle.getShopCarNum();
        try {
            beforeNum = Integer.valueOf(courseNum);
            System.out.println(beforeNum);
        }catch (Exception e){
            beforeNum = 0;
        }
        coursePageHandle.clickAddCart();
        try{
        driver.switchToMode();
        coursePageHandle.clickBuyNow();
        }catch (Exception e){

        }
        aftercourseNum = coursePageHandle.getShopCarNum();

        try{
            afterNum = Integer.valueOf(aftercourseNum);
            System.out.println(afterNum);
        }catch (Exception e){
            afterNum = beforeNum;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(afterNum == beforeNum + 1){
            System.out.println("添加购物车成功");
            coursePageHandle.clickShopCart();
        } else if (afterNum>0) {
            coursePageHandle.clickShopCart();
        }
    }
    /**
     * 点击立即购买
     * */
    public void buyNow(){
        coursePageHandle.clickBuyNow();
    }





































}
