package com.yangwenhao.designpatterns.abstractfactory;

/**
 * 小米产品工厂
 */
public class XiaomiProductFactory implements ProductFactory {
	
    @Override
    public PhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiRouter();
    }

}
