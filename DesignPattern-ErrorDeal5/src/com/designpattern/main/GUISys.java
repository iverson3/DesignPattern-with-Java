package com.designpattern.main;

import com.designpattern.errorclass.CommunicationError;
import com.designpattern.errorclass.DBAccessError;
import com.designpattern.errorclass.OtherError;
import com.designpattern.interfaces.CommErrorHandler;
import com.designpattern.interfaces.DbErrorHandler;
import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;
import com.designpattern.interfaces.OtherErrorHandler;

/**
 * 图形操作界面提示类
 * 需要处理哪些错误类型就实现哪些接口
 * @author ASUA
 *
 */
public class GUISys implements ErrorHandler, DbErrorHandler, CommErrorHandler, OtherErrorHandler
{
	public void announceError(ErrorBase error) {
        error.handle(this);
    }

	@Override
	public void handle(CommunicationError commError) {
		// TODO Auto-generated method stub
		System.out.println("通知用户界面进行有关通信错误");
	}

	@Override
	public void handle(DBAccessError dbError) {
		// TODO Auto-generated method stub
		System.out.println("通知用户界面进行有关数据库错误");
	}

	@Override
	public void handle(OtherError dbError) {
		// TODO Auto-generated method stub
		System.out.println("通知用户界面进行有关其他未知错误");
	}
}