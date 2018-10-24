package com.mushihsi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import javax.swing.*;
import java.util.List;

public class ActionSelenium {

    public WebDriver driver;
    /**
     *
     * 初始化driver
     * */
    public void InitDriver(){
        //设置环境变量
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        //
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com/user/newlogin/from_url/");

    }
    /**
     *  输入框
     * **/
    public void InputBox(){
        WebElement user =driver.findElement(By.name("email"));
        user.sendKeys("13780648319");
        user.clear();
        user.sendKeys("13780648319");
        //获取某个元素的属性
        String  user_info =user.getAttribute("placeholder");
        System.out.printf(user_info);
        //获取输入的数值
        String user_value = user.getAttribute("value");
        System.out.println(user_value);
        //查看是否选中
        boolean enable = user.isEnabled();
        System.out.println(enable);
        //输入密码
        driver.findElement(By.name("password")).sendKeys("feige6688");
        //点击button
        driver.findElement(By.className("moco-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 单选框的操作
     * */
    public void rediobox(){
        driver.get("https://www.imooc.com/user/setprofile");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //想要点击的框被遮挡住
        String jscript = "document.getElementById('J_GotoToP').style.display='none' ";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jscript);
        driver.findElement(By.className("icon-note")).click();
        //用xpath定位
        WebElement sex_node = driver.findElement(By.xpath("//*[@id='profile']/div[4]"));
        //WebElement sex_node = driver.findElement(By.className("moco-control-input"));
        List<WebElement> list_sex = sex_node.findElements(By.tagName("input"));
        for(WebElement sex:list_sex){
            boolean flag = sex.isSelected();
            if (flag == true){
                continue;
            }else {
                sex.click();
                break;
            }

        }
    }

    //多选框设置
    public void checkBox(){
        WebElement check =driver.findElement(By.id("auto-sigin"));
        System.out.println("是否选中了呢?"+check.isSelected());
        System.out.println("是否有效"+check.isEnabled());
        //check.clear();选择框不使用这个

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     *多选框
     * **/
    public void checkbox(){
        WebElement check_element = driver.findElement(By.id("auto-sigin"));
        //判断是否选中
        boolean is_selected = check_element.isSelected();
        System.out.println(is_selected);
        //判断是否有效
        boolean is_enabled = check_element.isEnabled();
        System.out.println(is_enabled);

    }
    /**
     *按钮
     * **/
    public void button(){
        WebElement login_button= driver.findElement(By.className("moco-btn"));
        String jscipt="document.getElementsByClassName('moco-btn')[0].style.display='none'";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jscipt);
        boolean is_display = login_button.isDisplayed();
        System.out.println(is_display);
        boolean is_en = login_button.isEnabled();
        System.out.println(is_en);
        login_button.click();
    }
    /**
     * form表单提交
     * **/
    public void web_form(){
        driver.findElement(By.id("signup-form")).submit();
        //没有登陆成功可能时提交地址发生了变化
    }

    /**
     * 上传文件
     * */
    public void upHeader(){
        driver.get("https://www.imooc.com/user/setbindsns");
        /**String jsString= "document.getElementById('js-avator-link')[0].style.bottom = 0";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsString);**/
        this.sleep(3000);
        //模拟滑动
        WebElement header =  driver.findElement(By.className("avator-img"));
        Actions actions = new Actions(driver);

        //移动加提交
        actions.moveToElement(header).perform();
        //driver.findElement(By.className("avator-img")).click();

        driver.findElement(By.className("update-avator")).click();

        driver.findElement(By.id("upload")).sendKeys("//Vincent//Users//vincent//Documents//WechatIMG1.jpeg");
        //可以使用autoit
    }
    /**
     * 下拉框操作
     * **/
    public void dowmsSlectBox(){
        driver.get("http://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        this.sleep(1000);
        //通过层级定位去查找
        WebElement forElement = driver.findElement(By.id("profile"));

        WebElement job = forElement.findElement(By.id("job"));

        Select downList = new Select(job);
        //通过index进行查找
        downList.selectByIndex(2);
        //通过value进行查找选择---不是可见的值
        //downList.deselectByValue("18");
        //通过文本进行查找
        //downList.deselectByVisibleText("学生");

        /**
         * 下拉框操作(多选框)不常用，只有在多选的下拉列表才常见
         * System.out.println(downList.isMultiple());查看是否是多选下拉框
         * downList.deselectAll();
         * downList.deselectByValue();
         * downList.deselectByVisibleText();
         */
        /**
         * 获取选择项的值
         * */
        //getAllSelectedOptions针对多选下拉列表
        System.out.println(downList.getAllSelectedOptions().get(0));
        List<WebElement>list =downList.getAllSelectedOptions();
        for (WebElement option:list){
            System.out.println(option.getText());
        }
         //getFirstSelectedOption获取当前下拉列表选中的值
        System.out.println(downList.getFirstSelectedOption().getText());


    }

    /**
     * 常用的鼠标操作
     * 1。鼠标左击
     *    Actions action = new Actions(driver);
     *    点击并提交
     *    action.click().perform();
     * 2。鼠标右击
     *    Actions action = new Actions(driver);
     *    点击并提交
     *    action.contestClick().perform();
     * 3。鼠标双击
     *    Actions action = new Actions(driver);
     *    点击并提交
     *    action.doubleClick().perform();
     * 4。鼠标悬停
     *    Actions action = new Actions(driver);
     *    点击并提交
     *    action.moveToElement().perform();
     * **/
    public void moseAction(){
        driver.get("https://www.imooc.com/");
        //WebElement logon = driver.findElement(By.id("js-signin-btn"));
        //分层查找方法
        WebElement logon = driver.findElement(By.className("menuContent"));
        List<WebElement> item = logon.findElements(By.className("item"));
        Actions action = new Actions(driver);
        //鼠标左击
        //action.click(logon).perform();
        //action.doubleClick(logon).perform();
        //this.sleep(2000);
        //action.contextClick(logon).perform();
        action.moveToElement(item.get(0)).perform();
        driver.findElement(By.linkText("区块链")).click();

    }


    /**
     * 等待时间
     * */
    public void sleep(int sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        //实例化对象
        ActionSelenium actionSelenium = new ActionSelenium();
        actionSelenium.InitDriver();
        //actionSelenium.InputBox();
        actionSelenium.moseAction();
        //actionSelenium.dowmsSlectBox();
        //actionSelenium.button();
        //actionSelenium.upHeader();

    }












}
