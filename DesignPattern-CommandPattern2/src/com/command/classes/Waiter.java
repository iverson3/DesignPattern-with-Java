package com.command.classes;

import java.sql.Time;
import java.util.ArrayList;

import com.command.abstracts.Command;

/**
 * 服务员类
 * 
 * 接收和记录命令
 * 通知具体执行者去执行命令
 * @author ASUA
 */
public class Waiter {
	// 命令对象容器
	ArrayList<Command> orders = new ArrayList<Command>();
	
	// 设置命令
	@SuppressWarnings("deprecation")
	public void SetOrder(Command command){
		if (command.toString() == "命令模式.BakeChickenWingCommand"){
			System.out.println("服务员说： 没有鸡翅了，您点别的烧烤吧");
		} else{
			// 将命令加入命令容器中
			orders.add(command);
			// 在订单中记录顾客点菜的信息 (日志记录) 以备算账收钱
			System.out.println("增加订单：" + command.toString() + "  时间： " + new Time(0, 0, 0).getTime());
		}
	}
	
	// 取消订单
	@SuppressWarnings("deprecation")
	public void CancelOrder(Command command){
		orders.remove(command);
		System.out.println("取消订单：" + command.toString() + "  时间： " + new Time(0, 0, 0).getTime());
	}
	
	// 通知全部执行
	public void Notify(){
		for (Command cmd : orders) {
			cmd.ExecuteCommand();
		}
	}
}
