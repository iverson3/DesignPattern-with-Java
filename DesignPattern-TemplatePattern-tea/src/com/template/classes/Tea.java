package com.template.classes;

import com.template.abstractclass.RefreshBeverage;

/**
 * 茶子类
 * 提供了茶制备的具体实现
 * @author ASUA
 */
public class Tea extends RefreshBeverage {
	
	public Tea(){
		/**
		 * 子类通过调用父类中的钩子方法 
		 * 指定是否在茶中加调味品
		 */
		super.isCustomerWantsCondiments(false);
	}
	
	/**
	 * 实现父类中的抽象方法
	 * 炮制饮料
	 */
	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡茶叶5分钟");
	}
	
	/**
	 * 实现父类中的抽象方法
	 * 加入调味料
	 */
	@Override
	protected void addCondiments() {
		System.out.println("加入凌檬");
	}
	
	/**
	 * 子类通过覆写的形式选择挂载钩子函数
	 * 禁止在茶中加入凌檬
	 */
	/*
	protected boolean isCustomerWantsCondiments() {
		return false;
	}
	*/

}
