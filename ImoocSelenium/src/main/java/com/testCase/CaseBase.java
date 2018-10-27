package com.testCase;

import com.base.DriverBase;

public class CaseBase {
    //只做一件事情，生成driver，让所有测试类都继承此类
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
