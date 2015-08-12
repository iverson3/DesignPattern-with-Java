package com.mediator.abstractclass;

/**
 * 抽象中介者类
 * 
 * @author ASUA
 */
public abstract class Mediator {
	public abstract void Send(String message, Colleague colleague);
}
