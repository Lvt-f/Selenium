package com.testCase;

import com.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class testCourseList extends CaseBase {
    public DriverBase driver;
    public testCourseList(){
        this.driver = InitDriver("chrome");

    }
    /**
     * div又很多层时，用最后一层定位，可定会存在定位问题
     * 返回之前界面时，重新刷新的了页面，之前的位置可能失效了
     * **/
    @Test
    public void CourseList(){
        driver.get("http://coding.imooc.com/");
        List<String> listString = this.listElement();
        for (int i = 0;i<listString.size();i++){
//            String name = listString.get(i);
//            WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]"));
//            while (!name.equals(element)){
//                driver.Roll();
//            }
//            element.click();
//            driver.back();
            driver.Roll(i);
            driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")).click();
            driver.back();
        }
    }
    /**
     *
     * 获取所有课程的list
     * **/
    public List<String> listElement(){
        List<String> listString = new ArrayList<String>();
        WebElement element =driver.findElement(By.className("shizhan-course-list"));
        List<WebElement> listElement = element.findElements(By.className("shizhan-course-box"));
        for (WebElement el:listElement){
            //获取所有的text信息
            listString.add(el.findElement(By.className("shizan-desc")).getText());
        }
        return listString;
    }
}
