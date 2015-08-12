package com.proxy.main;

import com.proxy.classes.Car;
import com.proxy.classes.Car2;
import com.proxy.classes.Car3;
import com.proxy.interfaces.Moveable;

/**
 * 测试类
 * @author ASUA
 */
public class Test {

	public static void main(String[] args) {
//		Moveable car = new Car();
//		car.move();
		
//		Moveable car2 = new Car2();
//		car2.move();
		
		Car car = new Car();
		Moveable car3 = new Car3(car);
		car3.move();
	}

}
