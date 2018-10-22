package com.LT.selenium;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 1.By.id
 * 2.By.name
 * 3.By.tagName
 * 4.By.className
 * 5.By.linkText
 * 6.By.partialLinkText
 * 7.By.xpath
 * 8.By.cssSelector
 * 9.表格定位
 * 10.层级定位
 *
 * */
public class selenium1 {
    public static void main(String[] args){
        WebDriver driver;
        //System.setProperty("webdriver.firefox.marionete","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        System.setProperty("webdriver.gecko.driver","/Applications/Firefox.app/Contents/MacOS/geckodriver");

        driver = new FirefoxDriver();
        //获取地址
        driver.get("https://www.imooc.com/user/newlogin/from_url/");
        //1。使用tagName定位
        driver.findElement(By.tagName("input")).sendKeys("13780648319");
        //2。使用name定位
        driver.findElement(By.name("password")).sendKeys("feige6688");
        //记住登陆
        driver.findElement(By.id("auto-signin")).click();
        //3。使用链接
        driver.findElement(By.linkText("立即注册")).click();
        //4。使用链接登陆
        driver.findElement(By.partialLinkText("直接")).click();
        //需要重新设置
        driver.findElement(By.tagName("input")).sendKeys("13780648319");
        driver.findElement(By.name("password")).sendKeys("feige6688");
        //5。使用className登陆
        driver.findElement(By.className("moco-btn")).click();

        driver.manage().window().maximize();

        //driver.get("http://www.imooc.com");

        driver.findElement(By.className("search-input")).click();
        driver.findElement(By.className("search-input")).sendKeys("3333");
        //层级定位
        WebElement element = driver.findElement(By.className("nav-item"));
        //List<WebElement> elements = element.findElements(By.className("li"));
        List<WebElement> elements = element.findElements(By.tagName("li"));
        elements.get(3).click();
    }


























}
