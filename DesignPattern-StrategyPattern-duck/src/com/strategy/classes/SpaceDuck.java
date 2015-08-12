package com.strategy.classes;

import com.strategy.abstractclass.Duck;
import com.strategy.strategyclass.FlyWithRocket;

/**
 * 太空鸭
 * 继承自Duck类
 * @author ASUA
 */
public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println("我头戴宇航头盔");
	}
	
	/**
	 * 因为当前鸭子的叫声不同
	 * 覆写父类的sqack方法
	 */
	public void sqack(){
		System.out.println("我通过无线电与你说话 嘎嘎嘎~");
	}
}
