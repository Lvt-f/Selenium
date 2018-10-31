package com.util;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
    public static void sendToEmail(String content){
        SimpleEmail email =new SimpleEmail();
        email.setHostName("pop.163.com");
        email.setAuthentication("ltfdhr3215@163.com","424255751ltf");
        try {
            email.setFrom("ltfdhr3215@163.com");
            email.addTo("ltfdhr258@163.com");
            email.setSubject("UI自动化测试邮件");
            email.setContent("这是我们需要发送的测试邮件","index.html;charset=utf-8");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

























}
