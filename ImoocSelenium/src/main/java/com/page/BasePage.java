package com.page;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * pag存储页面共用的基类一些方法
 * */
public class BasePage {
    public DriverBase driver;
    // 构造函数
    public BasePage(DriverBase driver){
        this.driver = driver;
    }
    /**
     * 定位Element方法
     * @param by by
     * */
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /**
     * 封装点击
     * */
    public void click(WebElement element){
        if(element != null){
            element.click();
        }else {
            System.out.println("元素没有定位到，点击失败");

        }
    }
    /**
     * 封装输入
     * */
    public void sendKeys(WebElement element,String value){
        if(element != null){
            element.sendKeys(value);
        }else {
            System.out.println(element+"元素没有定位到，输入失败"+value);
        }
    }
    /**
     * 层级定位，通过父节点定位子节点
     * 需要传入父节点和子节点的by
     * */
    public WebElement nodeElement(By by,By nodeby){
        WebElement el =this.element(by);
        return el.findElement(nodeby);
    }

    /**
    * 层级定位，通过父节点定位已购买弹窗确定按钮
    * */
    public WebElement getReadyBUy(){
        return nodeElement(getByLocator.getLocator("readybuySure"),getByLocator.getLocator("readybuySureNode"));
    }
    /**
     * 判断元素是否显示
     * */
    public boolean assertElementIs(WebElement element){
        return element.isDisplayed();
    }

    /**
     *获取文本信息
     * */
    public String getText(WebElement element){
        return element.getText();
    }

    /**
     * 还可以封装是否有效、是否存在、是否选中
     * */














}
