package com.responsibility.abstracts;

/**
 * Handler类 定义一个处理请求的接口
 * @author ASUA
 */
public abstract class Handler {
	// (处理请求的)继任者
	protected Handler successor;
	
	public void SetSuccessor(Handler successor){
		this.successor = successor;
	}
	
	// 处理请求的抽象方法 (接口)
	public abstract void HandleRequest(int request);
	
}
