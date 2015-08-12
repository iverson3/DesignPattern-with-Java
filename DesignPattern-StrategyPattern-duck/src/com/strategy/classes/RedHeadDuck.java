package com.strategy.classes;

import com.strategy.abstractclass.Duck;
import com.strategy.strategyclass.FlyWithWin;

/**
 * 红头鸭
 * 继承自Duck类
 * @author ASUA
 */
public class RedHeadDuck extends Duck {
	
	public RedHeadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
