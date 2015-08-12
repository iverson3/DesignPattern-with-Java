package com.command.classes;

import com.command.abstracts.Command;

/**
 * 具体命令类2
 * 
 * 烤鸡翅命令
 * @author ASUA
 */
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	// 执行命令
	public void ExecuteCommand() {
		// 烤肉串者执行烤鸡翅动作
		receiver.BakeChickenWing();
	}

}
