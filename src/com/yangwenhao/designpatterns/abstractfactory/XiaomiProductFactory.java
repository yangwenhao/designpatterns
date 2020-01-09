package com.yangwenhao.designpatterns.abstractfactory;

/**
 * С�ײ�Ʒ����
 */
public class XiaomiProductFactory implements ProductFactory {
	
    @Override
    public PhoneProduct produceTelPhone() {
        System.out.println(">>>>>>����С���ֻ�");
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        System.out.println(">>>>>>����С��·����");
        return new XiaomiRouter();
    }

}
