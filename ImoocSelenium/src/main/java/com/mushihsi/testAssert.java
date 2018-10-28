package com.mushihsi;

import org.testng.Assert;

//断言
public class testAssert {
    public static void main(String[] args){
        //当前值、预期的值
        Assert.assertEquals("·","2","这两个值不一样");
        Assert.assertNotNull("","现在不为空");
    }
}
