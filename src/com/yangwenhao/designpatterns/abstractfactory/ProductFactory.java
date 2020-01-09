package com.yangwenhao.designpatterns.abstractfactory;

/**
 * �����Ʒ������������ͬһ����Ʒ��Ĳ�Ʒ������Ϊ��
 */
public interface ProductFactory {

	/**
	 * �����ֻ�
	 * 
	 * @return
	 */
	PhoneProduct produceTelPhone();

	/**
	 * ����·����
	 * 
	 * @return
	 */
	RouterProduct produceRouter();

}
