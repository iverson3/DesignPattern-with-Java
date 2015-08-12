package com.proxy.classes;

import com.proxy.interfaces.Moveable;

/**
 * 小汽车类
 * 实现了Moveable接口
 * 通过聚合的方式实现代理
 * @author ASUA
 */
public class Car3 implements Moveable {
	
	private Car car;
	
	public Car3(Car car){
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		
		this.car.move();
		
		long end = System.currentTimeMillis();
		System.out.println("汽车结束行驶");
		
		System.out.println("行驶时间为:  " + (end - start) + " 毫秒");
	}

}
