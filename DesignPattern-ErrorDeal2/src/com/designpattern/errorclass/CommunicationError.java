package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;

/**
 * 通信错误类
 * 实现出现"通信错误"时的处理细节
 * @author ASUA
 */
public class CommunicationError implements ErrorBase {

	@Override
	public void handle() {
		/**
		 * 使用输出语句模拟对通信错误的细节处理
		 */
		System.out.println("出现 通信错误222");
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
