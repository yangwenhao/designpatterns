package com.yangwenhao.designpatterns.abstractfactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("===================С��ϵ�в�Ʒ=================");
		// С�ײ�Ʒ����ʵ��
		ProductFactory xiaomiProductFactory = new XiaomiProductFactory();
		// ����С��·����
		RouterProduct xiaomiRouter = xiaomiProductFactory.produceRouter();
		xiaomiRouter.start();
		xiaomiRouter.setting();
		xiaomiRouter.openWifi();
		xiaomiRouter.shutdown();
		// ����С���ֻ�
		PhoneProduct xiaomiPhone = xiaomiProductFactory.produceTelPhone();
		xiaomiPhone.start();
		xiaomiPhone.callUp();
		xiaomiPhone.sendSMS();
		xiaomiPhone.shutdown();

		System.out.println("===================��Ϊϵ�в�Ʒ=================");
		// ��Ϊ��Ʒ����ʵ��
		ProductFactory huaweiProductFactory = new HuaweiProductFactory();
		// ������Ϊ·����
		RouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
		huaweiRouter.start();
		huaweiRouter.setting();
		huaweiRouter.openWifi();
		huaweiRouter.shutdown();
		// ������Ϊ�ֻ�
		PhoneProduct huaweiPhone = huaweiProductFactory.produceTelPhone();
		huaweiPhone.start();
		huaweiPhone.callUp();
		huaweiPhone.sendSMS();
		huaweiPhone.shutdown();
	}

}
