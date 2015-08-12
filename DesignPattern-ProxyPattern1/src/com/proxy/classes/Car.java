package com.proxy.classes;

import com.proxy.interfaces.Moveable;

/**
 * 汽车类
 * 实现了Moveable接口
 * @author ASUA
 */
public class Car implements Moveable {

	/**
	 * 实现move接口方法
	 */
	public void move() {
		
		try {
			//实现行驶
			Thread.sleep(2000);
			System.out.println("汽车行驶中。。。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
