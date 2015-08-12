package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

/**
 * 数据库访问错误类
 * 实现出现"数据库访问错误"时的处理细节
 * @author ASUA
 */
public class DBAccessError implements ErrorBase{

	@Override
	public void handle(ErrorHandler handler) {
		handler.handle(this);
	}
}