package com.mushihsi;

import com.util.TestNgListenerScreen;
import com.util.baseDriver;
import org.testng.annotations.Listeners;

@Listeners(TestNgListenerScreen.class)
public class Login extends baseDriver {

//    //第二步初始化driver
//    public void InitDriver(){
//        //配置环境变量
//        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.imooc.com/user/newlogin/from_url/");
//        //driver.get("https://www.imooc.com/");
//        //页面最大化
//        //driver.manage().window().maximize();
//        // 在首页点击id为"js-signin-bin"登陆按钮
//        //driver.findElement(By.id("js-signin-btn")).click();
//    }
//    public void loginScript(String username,String userPass) throws InterruptedException
//    {
//        //初始化driver
//        this.InitDriver();
//        //挺一会
//        Thread.sleep(2000);
//        WebElement user = this.element(this.byStr("username"));
//        user.isDisplayed();
//        WebElement password = this.element(this.byStr("userpass"));
//        password.isDisplayed();
//        System.out.println(password.isDisplayed());
//        WebElement login_button= this.element(this.byStr("loginbutton"));
//        login_button.isDisplayed();
//        //输入账号密码
//        user.sendKeys(username);
//        password.sendKeys(userPass);
//        System.out.println(login_button.isDisplayed());
//        //点击登陆按钮
//        login_button.click();
//        Thread.sleep(3000);
//        WebElement header = this.element(this.byStr("header"));
//        header.isDisplayed();
//        //移动到这个位置上
//        Actions actions = new Actions(driver);
//        actions.moveToElement(header).perform();
//        String userInfo = this.element(this.byStr("nameInfo")).getText();
//        if(userInfo.equals("吕小灰木有衣服穿")){
//            //this.tackScreenShot();
//            System.out.println("登陆成功");
//        }else {
//            System.out.println("登陆失败");
//        }
//        driver.close();
//
//        /**
//         * 第一个是driver
//         * 第二个定位的内容
//         * **/
//    }
//    /**
//     *  封装 element
//     * **/
//    public WebElement element(By by){
//        WebElement ele =driver.findElement(by);
//        return ele;
//    }
//    /**
//     * 截图
//     * **/
//    public void tackScreenShot(){
//        //获取时间
//        long data =System.currentTimeMillis();
//        //转换成string
//        String path =String.valueOf(data);
//        //获取系统当前路径
//        String curPath = System.getProperty("user.dir");
//        path = path+".png";
//        //存放路径
//        String screenPaht = curPath+"/"+path;
//        //截图
//        File scree = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        //截图存放的地方
//        try {
//            FileUtils.copyFile(scree,new File(screenPaht));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    /**
//     * By封装 by
//     * **/
//    public By byStr(String username){
//        //读取配置文件
//        ProUtil properties = new ProUtil("element.properties");
//        //取得key值
//        String locator =properties.getPro(username);
//        //拆分">"
//        String locatorType = locator.split(">")[0];
//        String locatorValue = locator.split(">")[1];
//
//        if (locatorType.equals("id")){
//            return By.id(locatorValue);
//        }else if(locatorType.equals("name")){
//            return By.name(locatorValue);
//        }else if(locatorType.equals("className")){
//            return By.className(locatorValue);
//        }else {
//            return By.xpath(locatorValue);
//        }
//    }
//
//    @Test
//    public static void main(String[] args) throws Exception {
//        Login login = new Login();
//        //固定调用一个参数
//        //login.loginScript("13780648319","feige6688");
//        /**
//         * 登陆账号参数化
//         * key-value
//         * username-password
//         * */
//        HashMap<String,String> user = new HashMap<String, String>();
//        user.put("13780648319","feige6688");
//        user.put("1232312","123123");
//        Iterator us=user.entrySet().iterator();
//        while (us.hasNext()){
//            Map.Entry entry = (Map.Entry) us.next();
//            String username=entry.getKey().toString();
//            String password =entry.getValue().toString();
//            System.out.println(username+" "+password);
//            login.loginScript(username,password);
//        }
//    }












































}
