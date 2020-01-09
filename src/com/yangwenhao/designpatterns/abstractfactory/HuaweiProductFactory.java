package com.yangwenhao.designpatterns.abstractfactory;

/**
 * 华为产品工厂
 */
public class HuaweiProductFactory implements ProductFactory {
    @Override
    public PhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        System.out.println(">>>>>>生产华为路由器");
        return new HuaweiRouter();
    }
}
