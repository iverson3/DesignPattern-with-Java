package com.strategy.classes;

import com.strategy.abstractclass.Duck;
import com.strategy.strategyclass.FlyNoWay;

/**
 * 大黄鸭
 * 继承自Duck类
 * @author ASUA
 */
public class BigYellowDuck extends Duck {
	
	public BigYellowDuck(){
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我身体很大，身体黄黄");
	}

}
