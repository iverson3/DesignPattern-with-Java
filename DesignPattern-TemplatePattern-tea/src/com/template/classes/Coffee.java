package com.template.classes;

import com.template.abstractclass.RefreshBeverage;

/**
 * 咖啡子类
 * 提供了咖啡制备的具体实现
 * @author ASUA
 */
public class Coffee extends RefreshBeverage {
	/**
	 * 实现父类中的抽象方法
	 * 炮制饮料
	 */
	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}
	/**
	 * 实现父类中的抽象方法
	 * 加入调味料
	 */
	@Override
	protected void addCondiments() {
		System.out.println("加入糖和牛奶");
	}

}
