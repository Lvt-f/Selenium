package com.base;
/**
 * 所有类的基类别
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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




















}
