package com.designpattern.main;

import com.designpattern.errorclass.DBAccessError;
import com.designpattern.interfaces.DbErrorHandler;
import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

/**
 * log日志系统提示类
 * 需要处理哪些错误类型就实现哪些接口
 * @author ASUA
 *
 */
public class LogSys implements ErrorHandler, DbErrorHandler 
{
	public void announceError(ErrorBase error) {
    	error.handle(this);
    }

	@Override
	public void handle(DBAccessError dbError) {
		// TODO Auto-generated method stub
		System.out.println("通知日志系统进行有关数据库错误");
	}
}
