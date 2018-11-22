package com.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class baseDriver {
    WebDriver driver ;
    public baseDriver(){
         System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
         driver = new ChromeDriver();
    }
    /**
     * 截图
     * **/
    public void tackScreenShot(){
        //获取时间
        long data =System.currentTimeMillis();
        //转换成string
        String path =String.valueOf(data);
        //获取系统当前路径
        String curPath = System.getProperty("user.dir");
        path = path+".png";
        //存放路径
        String screenPaht = curPath+"/"+path;
        //截图
        File scree = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //截图存放的地方
        try {
            FileUtils.copyFile(scree,new File(screenPaht));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
