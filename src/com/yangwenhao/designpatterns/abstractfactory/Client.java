package com.yangwenhao.designpatterns.abstractfactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("===================小米系列产品=================");
		// 小米产品工厂实例
		ProductFactory xiaomiProductFactory = new XiaomiProductFactory();
		// 生产小米路由器
		RouterProduct xiaomiRouter = xiaomiProductFactory.produceRouter();
		xiaomiRouter.start();
		xiaomiRouter.setting();
		xiaomiRouter.openWifi();
		xiaomiRouter.shutdown();
		// 生产小米手机
		PhoneProduct xiaomiPhone = xiaomiProductFactory.produceTelPhone();
		xiaomiPhone.start();
		xiaomiPhone.callUp();
		xiaomiPhone.sendSMS();
		xiaomiPhone.shutdown();

		System.out.println("===================华为系列产品=================");
		// 华为产品工厂实例
		ProductFactory huaweiProductFactory = new HuaweiProductFactory();
		// 生产华为路由器
		RouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
		huaweiRouter.start();
		huaweiRouter.setting();
		huaweiRouter.openWifi();
		huaweiRouter.shutdown();
		// 生产华为手机
		PhoneProduct huaweiPhone = huaweiProductFactory.produceTelPhone();
		huaweiPhone.start();
		huaweiPhone.callUp();
		huaweiPhone.sendSMS();
		huaweiPhone.shutdown();
	}

}
