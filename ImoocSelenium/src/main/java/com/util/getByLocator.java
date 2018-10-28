package com.util;

import org.openqa.selenium.By;

public class getByLocator {
    /**
     * By封装 by
     * **/
    public static By getLocator(String key){
        //读取配置文件
        ProUtil pro = new ProUtil("element.properties");
        //取得key值
        String locator =pro.getPro(key);
        //拆分">"
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else {
            return By.linkText(locatorValue);
        }
    }
}
