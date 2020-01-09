package com.yangwenhao.designpatterns.abstractfactory;

/**
 * ��Ϊ��Ʒ����
 */
public class HuaweiProductFactory implements ProductFactory {
    @Override
    public PhoneProduct produceTelPhone() {
        System.out.println(">>>>>>������Ϊ�ֻ�");
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        System.out.println(">>>>>>������Ϊ·����");
        return new HuaweiRouter();
    }
}
