package com.responsibility.classes;

import com.responsibility.abstracts.Handler;

/**
 * 具体处理者类
 * 
 * 处理它所负责的请求，可访问它的后继者
 * 如果可以处理该请求，则处理；否则就将该请求转发给它的后继者
 * @author ASUA
 */
public class ConcreteHandler4 extends Handler {

	public void HandleRequest(int request) {
		// 当前处理者类 作为最后处理者，处理所有传递到这里的请求 (边界处理者)
		// 处理请求
		System.out.println(this.toString() + " 处理请求 " + request);
	}

}
