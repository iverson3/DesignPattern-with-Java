package com.proxy.classes;

import com.proxy.interfaces.Moveable;

/**
 * 汽车行驶时间记录代理类
 * 实现了Moveable接口
 * 通过聚合的方式实现代理
 * @author ASUA
 */
public class CarTimeProxy implements Moveable {
	
	private Moveable m;
	
	public CarTimeProxy(Moveable m){
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		
		this.m.move();
		
		long end = System.currentTimeMillis();
		System.out.println("汽车结束行驶");
		
		System.out.println("行驶时间为:  " + (end - start) + " 毫秒");
	}

}
