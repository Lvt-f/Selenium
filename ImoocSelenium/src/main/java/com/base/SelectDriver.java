package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    //根据浏览器的型号去生成webDriver
    public WebDriver driverName(String browser){
        if(browser.equalsIgnoreCase("firFox")){
            System.setProperty("webdriver.firefox.marionette","/Applications/Firefox.app/Contents/MacOS/geckodriver");
            return new FirefoxDriver();
        }else {
            System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
            return new ChromeDriver();
        }
    }
}
