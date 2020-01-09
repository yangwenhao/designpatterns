package com.yangwenhao.designpatterns.abstractfactory;

/**
 * ·������Ʒ�ӿ�
 */
public interface RouterProduct {
    /**
     * ����
     */
    void start();

    /**
     * �ػ�
     */
    void shutdown();

    /**
     * ����wifi
     */
    void openWifi();

    /**
     * ���ò���
     */
    void setting();
}
