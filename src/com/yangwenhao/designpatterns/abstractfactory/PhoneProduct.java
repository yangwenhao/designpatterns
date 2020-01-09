package com.yangwenhao.designpatterns.abstractfactory;

/**
 * �ֻ���Ʒ�ӿ�
 */
public interface PhoneProduct {
    /**
     * ����
     */
    void start();

    /**
     * �ػ�
     */
    void shutdown();

    /**
     * ����绰
     */
    void callUp();

    /**
     * ���Ͷ���
     */
    void sendSMS();

}
