package com.yangwenhao.designpatterns.abstractfactory;

/**
 * 手机产品接口
 */
public interface PhoneProduct {
    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 拨打电话
     */
    void callUp();

    /**
     * 发送短信
     */
    void sendSMS();

}
