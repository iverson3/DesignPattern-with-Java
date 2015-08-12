package com.strategy.main;

import com.strategy.abstractclass.Duck;
import com.strategy.classes.BigYellowDuck;
import com.strategy.classes.RedHeadDuck;
import com.strategy.classes.RubberDuck;
import com.strategy.classes.SpaceDuck;

/**
 * 测试类
 * @author ASUA
 */
class Test{
	public static void main(String[] args) {
		Duck d = new SpaceDuck();
		
		d.sqack();
		d.display();
		d.fly();
	}
}