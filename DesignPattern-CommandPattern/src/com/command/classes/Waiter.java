package com.command.classes;

import com.command.abstracts.Command;

/**
 * 服务员类
 * 
 * 接收和记录命令
 * 通知具体执行者去执行命令
 * @author ASUA
 */
public class Waiter {
	// 命令对象
	private Command command;
	
	// 设置命令
	public void SetOrder(Command command){
		this.command = command;
	}
	
	// 通知执行
	public void Notify(){
		command.ExecuteCommand();
	}
}
