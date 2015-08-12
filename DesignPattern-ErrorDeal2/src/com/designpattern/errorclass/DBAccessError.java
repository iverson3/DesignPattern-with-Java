package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;

/**
 * 数据库访问错误类
 * 实现出现"数据库访问错误"时的处理细节
 * @author ASUA
 */
public class DBAccessError implements ErrorBase{

	@Override
	public void handle() {
		/**
		 * 使用输出语句模拟对数据库访问错误的细节处理
		 */
		System.out.println("出现 数据库访问错误222");
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}