package com.mediator.abstractclass;

/**
 * 抽象同事类
 * 
 * @author ASUA
 */
public abstract class Colleague {
	// 中介者对象
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
