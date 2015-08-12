package com.proxy.classes;

import com.proxy.interfaces.Moveable;

/**
 * 汽车行驶的log日志记录代理类
 * 实现了Moveable接口
 * 通过聚合的方式实现代理
 * @author ASUA
 */
public class CarLogProxy implements Moveable {
	
	private Moveable m;
	
	public CarLogProxy(Moveable m){
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		System.out.println("开始记录日志...");
		
		this.m.move();
		
		System.out.println("日志记录结束...");
	}

}
