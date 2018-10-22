package com.mushihsi;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin2.message.JavaScriptEvalMessage;

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
        /**String jscript = "document.getElementById('J_GotoToP').style.display='none' ";
        JavaScriptExecutor js = (JavaScriptExecutor) driver;
        js.executeScript(jscript);*/
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
        /**String jscipt="document.getElementsByClassName('moco-btn')[0].style.display='none'";
        JavaScriptExecutor js = (JavaScriptExecutor) driver;
        js.executeScript(jscipt);**/
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
        driver.findElement(By.className("avator-img")).click();
        driver.findElement(By.className("update-avator")).click();

    }
    public static void main(String[] args){
        //实例化对象
        ActionSelenium actionSelenium = new ActionSelenium();
        actionSelenium.InitDriver();
        actionSelenium.InputBox();
        //actionSelenium.button();
        actionSelenium.upHeader();

    }












}
