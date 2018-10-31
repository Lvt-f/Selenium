package com.base;
/**
 * 所有类的基类别
 * */
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class DriverBase {

    public WebDriver driver;

    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }
    //停止使用web
    public void stop(){
        System.out.println("stop webdriver");
        driver.close();
    }
    /**
     * 封装Element方法
     * */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /**
     * get封装
     * */
    public void get(String url){
        driver.get(url);
    }
    /**
     * 返回
     * **/
    public void back(){
        driver.navigate().back();
    }
    /***
     * 页面滚动
     * */
    public void Roll(int hight){
       //driver.manage().window();
        int windowHight = 300;
        while (hight<100){
            hight++;
            windowHight = windowHight+100;
        }
        String window ="window.scrollTo(0,"+windowHight+")";
       ((JavascriptExecutor) driver).executeScript(window);
    }
    /**
     * 滑动到底部
     * */
    public void RollDown(){
        Actions action =new Actions(driver);
        action.sendKeys(Keys.END).perform();//下拉到底部
    }
    /**
     * 页面放大
     * */
    public void Big(){
        driver.manage().window().maximize();
    }
    /**
     * 点击时间
     * */
    public void click(WebElement element){
        element.click();
    }
    /**
     * 切换windows窗口
     * */
    public void switchWindows(String name){
        driver.switchTo().window(name);
    }
    /**
     * 切换alert窗口
     * */
    public void switchSlert(){
        driver.switchTo().alert();
    }
    /**
     * 模态框切换
     * */
    public void switchToMode(){
        driver.switchTo().activeElement();
    }
    /**
     * 推出
     * */
    public void close(){
        driver.close();
    }
















}
