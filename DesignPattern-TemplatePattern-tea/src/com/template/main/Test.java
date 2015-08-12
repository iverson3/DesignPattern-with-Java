package com.template.main;

import com.template.abstractclass.RefreshBeverage;
import com.template.classes.Coffee;
import com.template.classes.Tea;

/**
 * 测试类
 * @author ASUA
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("开始制备咖啡...");
		
		RefreshBeverage b = new Coffee();
		b.prepareBeverageTemplate();
		
		System.out.println("咖啡好了");
		
		System.out.println("****************************************************************");
		
		System.out.println("开始制备茶...");
		
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		
		System.out.println("茶好了");
	}

}
