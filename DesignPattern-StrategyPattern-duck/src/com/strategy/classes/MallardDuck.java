package com.strategy.classes;

import com.strategy.abstractclass.Duck;
import com.strategy.strategyclass.FlyWithWin;

/**
 * 野鸭类
 * 继承自Duck类
 * @author ASUA
 */
public class MallardDuck extends Duck {
	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}
