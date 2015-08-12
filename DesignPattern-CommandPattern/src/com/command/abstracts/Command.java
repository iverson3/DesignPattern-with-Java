package com.command.abstracts;

import com.command.classes.Barbecuer;

/**
 * Command类
 * 
 * 用来声明执行操作的接口
 * @author ASUA
 *
 */
public abstract class Command {
	// 命令的具体执行者
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver){
		this.receiver = receiver;
	}
	
	// 执行命令
	abstract public void ExecuteCommand();
}
