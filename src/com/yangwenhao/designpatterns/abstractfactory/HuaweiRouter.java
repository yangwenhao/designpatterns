package com.yangwenhao.designpatterns.abstractfactory;

/**
 * ��Ϊ·������Ʒ
 */
public class HuaweiRouter implements RouterProduct {

    @Override
    public void start() {
        System.out.println("������Ϊ·����");
    }

    @Override
    public void shutdown() {
        System.out.println("�رջ�Ϊ·����");
    }

    @Override
    public void openWifi() {
        System.out.println("�򿪻�Ϊ·������wifi����");
    }

    @Override
    public void setting() {
        System.out.println("���û�Ϊ·��������");
    }

}
