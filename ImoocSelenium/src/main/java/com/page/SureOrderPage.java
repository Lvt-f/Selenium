package com.page;

import com.base.DriverBase;
import com.util.getByLocator;
import org.openqa.selenium.WebElement;

public class SureOrderPage extends BasePage {
    public SureOrderPage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取提交订单按钮
     * */
    public WebElement getSubOrderElement(){
        return element(getByLocator.getLocator("sureOrder"));
    }






















}
