package com.yangwenhao.designpatterns.abstractfactory;

/**
 * С���ֻ���Ʒ
 */
public class XiaomiPhone implements PhoneProduct {

    @Override
    public void start() {
        System.out.println("����С���ֻ�");
    }

    @Override
    public void shutdown() {
        System.out.println("�ر�С���ֻ�");
    }

    @Override
    public void callUp() {
        System.out.println("��С���ֻ���绰");
    }

    @Override
    public void sendSMS() {
        System.out.println("��С���ֻ�������");
    }

}
