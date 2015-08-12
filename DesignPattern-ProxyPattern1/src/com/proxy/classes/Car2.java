package com.proxy.classes;

/**
 * 小汽车类
 * 继承自Car汽车类
 * 通过继承的方式实现静态代理
 * @author ASUA
 */
public class Car2 extends Car {

	/**
	 * 覆写父类的move方法
	 * 并调用执行父类的move方法
	 */
	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		
		super.move();
		
		long end = System.currentTimeMillis();
		System.out.println("汽车结束行驶");
		
		System.out.println("行驶时间为:  " + (end - start) + " 毫秒");
	}
	
}
