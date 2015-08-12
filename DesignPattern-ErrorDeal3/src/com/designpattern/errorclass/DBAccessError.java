package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;

/**
 * 数据库访问错误类
 * 实现出现"数据库访问错误"时的处理细节
 * @author ASUA
 */
public class DBAccessError implements ErrorBase{

	@Override
	public void guiHandle() {
		/**
		 * 使用输出语句模拟对数据库访问错误的细节处理
		 */
		System.out.println("通知-用户界面-的数据库访问错误");
	}

	@Override
	public void logHandle() {
		/**
		 * 使用输出语句模拟对数据库访问错误的细节处理
		 */
		System.out.println("通知-日志系统-的数据库访问错误");
		
	}
}