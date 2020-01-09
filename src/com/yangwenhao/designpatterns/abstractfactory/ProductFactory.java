package com.yangwenhao.designpatterns.abstractfactory;

/**
 * 抽象产品工厂（定义了同一个产品族的产品生产行为）
 */
public interface ProductFactory {

	/**
	 * 生产手机
	 * 
	 * @return
	 */
	PhoneProduct produceTelPhone();

	/**
	 * 生产路由器
	 * 
	 * @return
	 */
	RouterProduct produceRouter();

}
