package com.yangwenhao.designpatterns.abstractfactory;

/**
 * ��Ϊ�ֻ���Ʒ
 */
public class HuaweiPhone implements PhoneProduct {

    @Override
    public void start() {
        System.out.println("������Ϊ�ֻ�");
    }

    @Override
    public void shutdown() {
        System.out.println("�رջ�Ϊ�ֻ�");
    }

    @Override
    public void callUp() {
        System.out.println("�û�Ϊ�ֻ���绰");
    }

    @Override
    public void sendSMS() {
        System.out.println("�û�Ϊ�ֻ�������");
    }

}
