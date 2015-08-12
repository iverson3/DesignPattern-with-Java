package com.designpattern.interfaces;

import com.designpattern.errorclass.DBAccessError;

/**
 * "数据库访问错误"处理接口
 * @author ASUA
 *
 */
public interface DbErrorHandler {
	public void handle(DBAccessError dbError);
}
