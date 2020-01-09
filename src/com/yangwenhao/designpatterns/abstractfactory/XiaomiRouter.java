package com.yangwenhao.designpatterns.abstractfactory;

/**
 * С��·������Ʒ
 */
public class XiaomiRouter implements RouterProduct {

    @Override
    public void start() {
        System.out.println("����С��·����");
    }

    @Override
    public void shutdown() {
        System.out.println("�ر�С��·����");
    }

    @Override
    public void openWifi() {
        System.out.println("��С��·������wifi����");
    }

    @Override
    public void setting() {
        System.out.println("����С��·��������");
    }

}
