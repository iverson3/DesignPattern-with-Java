package com.mediator.classes;

import com.mediator.abstractclass.Colleague;
import com.mediator.abstractclass.Mediator;

/**
 * 同事1对象
 * 
 * @author ASUA
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		
	}
	
	public void Send(String message){
		mediator.Send(message, this);
	}
	
	public void Notify(String message){
		System.out.println("同事1得到消息: " + message);
	}

}
