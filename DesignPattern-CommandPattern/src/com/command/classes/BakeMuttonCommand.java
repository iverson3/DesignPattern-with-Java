package com.command.classes;

import com.command.abstracts.Command;

/**
 * 具体命令类1
 * 
 * 烤羊肉串命令
 * @author ASUA
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	// 执行命令
	public void ExecuteCommand() {
		// 烤肉串者执行烤羊肉动作
		receiver.BakeMutton();
	}

}
