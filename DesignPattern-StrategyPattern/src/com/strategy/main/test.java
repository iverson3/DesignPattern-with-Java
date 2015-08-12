package com.strategy.main;

import com.strategy.classes.CashContext;
import com.strategy.classes.CashType;

/**
 * 测试类
 * @author ASUA
 */
class test{
	public static void main(String args[]){
		//付费方式
		CashType type = CashType.CashReturn;
		//价格
		double price = 100.0;
		//数量/重量
		double num = 4;
		
		/**
		 * 实例化CashContext付费处理类
		 * 指定付费方式
		 */
		CashContext csuper = new CashContext(type);
		double totalPrices = 0d;
		totalPrices = csuper.GetResult(price * num);
		
		System.out.println(totalPrices);
	}
}