package com.strategy.strategyclass;

import com.strategy.interfaces.FlyingStragety;

/**
 * 飞行策略接口的实现类
 * @author ASUA
 */
public class FlyWithRocket implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("我借助火箭飞行");
	}

}
