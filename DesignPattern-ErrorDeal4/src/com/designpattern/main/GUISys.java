package com.designpattern.main;

import com.designpattern.errorclass.CommunicationError;
import com.designpattern.errorclass.DBAccessError;
import com.designpattern.errorclass.OtherError;
import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

/* 省略了用户界面中的其他的功能 */
public class GUISys implements ErrorHandler
{
	public void announceError(ErrorBase error) {
        error.handle(this);
    }
	
	@Override
	public void handle(DBAccessError dbError) {
		/* 通知用户界面进行有关数据库错误的处理 */
		System.out.println("通知-用户界面-进行有关-数据库-错误");
	}

	@Override
	public void handle(CommunicationError commError) {
		/* 通知用户界面进行有关通信错误的处理 */
		System.out.println("通知-用户界面-进行有关-通信-错误");
	}

	@Override
	public void handle(OtherError othError) {
		/* 通知用户界面进行有关未知错误的处理 */
		System.out.println("通知-用户界面-进行有关-未知-错误");
	}
}