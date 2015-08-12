package com.factory.main;

import com.factory.classes.CashFactory;
import com.factory.classes.CashSuper;
import com.factory.classes.CashType;

/**
 * 测试类
 * @author ASUA
 */
class test{
	public static void main(String args[]){
		//付费方式
		CashType type = CashType.CashRebate;
		//价格
		double price = 100.0;
		//数量/重量
		double num = 4;
		
		/**
		 * 调用工厂类的方法
		 * 创建并获得对应的付费处理类的对象实例
		 */
		CashSuper csuper = CashFactory.createCashAccept(type);
		double totalPrices = 0d;
		totalPrices = csuper.acceptCash(price * num);
		
		System.out.println(totalPrices);
	}
}