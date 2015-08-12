package com.designpattern.interfaces;

import com.designpattern.errorclass.CommunicationError;
import com.designpattern.errorclass.DBAccessError;
import com.designpattern.errorclass.OtherError;

/**
 * 错误处理接口
 * @author ASUA
 *
 */
public interface ErrorHandler {
	public void handle(DBAccessError dbError);
    public void handle(CommunicationError commError);
    public void handle(OtherError othError);
}