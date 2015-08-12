package com.designpattern.main;

import com.designpattern.errorclass.CommunicationError;
import com.designpattern.errorclass.DBAccessError;
import com.designpattern.errorclass.OtherError;
import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

public class LogSys implements ErrorHandler {
	public void announceError(ErrorBase error) {
    	error.handle(this);
    }

	@Override
	public void handle(DBAccessError dbError) {
		/* 通知日志系统进行有关数据库错误的处理 */
		System.out.println("通知-日志系统-进行有关-数据库-错误");
	}

	@Override
	public void handle(CommunicationError commError) {
		/* 通知日志系统进行有关通信错误的处理 */
		System.out.println("通知-日志系统-进行有关-通信-错误");
	}

	@Override
	public void handle(OtherError othError) {
		/* 通知日志系统进行有关未知错误的处理 */
		System.out.println("通知-日志系统-进行有关-未知-错误");
	}
}
