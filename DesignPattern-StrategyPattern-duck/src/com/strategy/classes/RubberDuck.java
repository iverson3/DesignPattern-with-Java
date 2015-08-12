package com.strategy.classes;

import com.strategy.abstractclass.Duck;
import com.strategy.strategyclass.FlyNoWay;

/**
 * 塑胶鸭
 * 继承自Duck类
 * @author ASUA
 */
public class RubberDuck extends Duck {
	
	public RubberDuck(){
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我全身发黄，嘴巴很红");
	}
	
	/**
	 * 因为当前鸭子的叫声不同
	 * 覆写父类的sqack方法
	 */
	public void sqack(){
		System.out.println("嘎~嘎~嘎");
	}

}
