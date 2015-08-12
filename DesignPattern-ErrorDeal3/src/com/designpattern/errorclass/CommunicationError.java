package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;

/**
 * 通信错误类
 * 实现出现"通信错误"时的处理细节
 * @author ASUA
 */
public class CommunicationError implements ErrorBase {

	@Override
	public void guiHandle() {
		/**
		 * 使用输出语句模拟对通信错误的细节处理
		 */
		System.out.println("通知-用户界面-的通信错误");
	}

	@Override
	public void logHandle() {
		/**
		 * 使用输出语句模拟对通信错误的细节处理
		 */
		System.out.println("通知-日志系统-的通信错误");
		
	}
}
