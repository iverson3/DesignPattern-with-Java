package com.command.main;

import com.command.abstracts.Command;
import com.command.classes.BakeChickenWingCommand;
import com.command.classes.BakeMuttonCommand;
import com.command.classes.Barbecuer;
import com.command.classes.Waiter;

/**
 * 测试类
 * @author ASUA
 */
public class test {

	public static void main(String[] args) {
		// 开店前的准备
		Barbecuer boy = new Barbecuer();
		Command bmc1 = new BakeMuttonCommand(boy);
		Command bmc2 = new BakeMuttonCommand(boy);
		Command bcwc1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		// 开门营业 顾客点菜
 		girl.SetOrder(bmc1);
		girl.SetOrder(bmc2);
		girl.SetOrder(bcwc1);
		
		// 点菜完毕 通知烧烤者执行
		girl.Notify();
	}

}
