package com.strategy.abstractclass;

import com.strategy.interfaces.FlyingStragety;

/**
 * 鸭子类
 * 抽象类 父类
 * 抽象了鸭子的行为：显示和鸣叫
 * @author ASUA
 */
public abstract class Duck {
	/**
	 * 行策略接口实现类的对象实例
	 */
	private FlyingStragety flyingStragety;
	
	/**
	 * 鸭子的鸣叫
	 * 通用行为  由父类实现
	 */
	public void sqack(){
		System.out.println("嘎嘎嘎");
	}
	/**
	 * 鸭子的显示样子
	 * 行为不确定  声明为abstract  由子类实现
	 */
	public abstract void display();
	
	/**
	 * 设置飞行策略接口实现类的对象实例
	 * @param flyingStragety
	 */
	public void setFlyingStragety(FlyingStragety flyingStragety){
		this.flyingStragety = flyingStragety;
	}
	
	/**
	 * 鸭子的飞行行为
	 * 由飞行策略接口实现类的具体实现方法来决定具体飞行行为
	 */
	public void fly(){
		this.flyingStragety.performFly();
	}
}
