package com.responsibility.classes;

import com.responsibility.abstracts.Handler;

/**
 * 具体处理者类
 * 
 * 处理它所负责的请求，可访问它的后继者
 * 如果可以处理该请求，则处理；否则就将该请求转发给它的后继者
 * @author ASUA
 */
public class ConcreteHandler1 extends Handler {

	public void HandleRequest(int request) {
		// 当前处理者类 处理request为0-10之间的请求
		if(request >= 0 && request < 10){
			// 处理请求
			System.out.println(this.toString() + " 处理请求 " + request);
		}else if(successor != null){
			// 将请求转发给后继者
			successor.HandleRequest(request);
		}else{
			
		}
	}

}
