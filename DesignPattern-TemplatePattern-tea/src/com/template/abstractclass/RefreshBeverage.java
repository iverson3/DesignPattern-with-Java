package com.template.abstractclass;

/**
 * "提神饮料"抽象基类
 * 为所有子类提供一个算法(业务)框架
 * @author ASUA
 */
public abstract class RefreshBeverage {
	/**
	 * 是否在饮料中加入调味料
	 * 默认加入
	 */
	protected boolean isAdd = true;
	
	/**
	 * 制备饮料的模板方法
	 * 封装了所有子类需要共同遵循的算法框架
	 * final 禁止和防止子类对该方法进行覆写
	 */
	public final void prepareBeverageTemplate(){
		//将水煮沸
		boilWater();
		//炮制饮料
		brew();
		//将饮料倒入杯中
		pourInCup();
		
		if (isAdd) {
			//加入调味料
			addCondiments();
		}
	}
	
	/**
	 * 钩子(Hook)方法  提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否需要加入调料
	 * @return
	 */
	/*
	protected boolean isCustomerWantsCondiments() {
		return false;
	}
	*/
	protected void isCustomerWantsCondiments(boolean bool) {
		this.isAdd = bool;
	}

	/**
	 * 将水煮沸
	 * final 禁止和防止子类对该方法进行覆写
	 */
	private final void boilWater() {
		System.out.println("将水煮沸");
	}
	
	/**
	 * 抽象方法
	 * 炮制饮料
	 */
	protected abstract void brew();
	
	/**
	 * 将饮料倒入杯中
	 * final 禁止和防止子类对该方法进行覆写
	 */
	private final void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}
	
	/**
	 * 抽象方法
	 * 加入调味料
	 */
	protected abstract void addCondiments();

}
