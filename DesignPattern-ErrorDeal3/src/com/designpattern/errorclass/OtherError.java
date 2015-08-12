package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;

/**
 * 未知类型错误类
 * 实现出现"未知类型错误"时的处理细节
 * @author ASUA
 */
public class OtherError implements ErrorBase {

	@Override
	public void guiHandle() {
		/**
		 * 使用输出语句模拟对未知类型错误的细节处理
		 */
		System.out.println("通知-用户界面-的未知类型错误");
	}

	@Override
	public void logHandle() {
		/**
		 * 使用输出语句模拟对未知类型错误的细节处理
		 */
		System.out.println("通知-日志系统-的未知类型错误");
		
	}
}
