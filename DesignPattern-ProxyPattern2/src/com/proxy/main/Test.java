package com.proxy.main;

import com.proxy.classes.Car;
import com.proxy.classes.Car2;
import com.proxy.classes.CarLogProxy;
import com.proxy.classes.CarTimeProxy;
import com.proxy.interfaces.Moveable;

/**
 * 测试类
 * @author ASUA
 */
public class Test {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		
//		CarTimeProxy ctp = new CarTimeProxy(car);
//		CarLogProxy clp = new CarLogProxy(ctp);
//		
//		clp.move();
//		
		
		
		Car car = new Car();
		
		CarLogProxy clp = new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		
		ctp.move();
	}

}
