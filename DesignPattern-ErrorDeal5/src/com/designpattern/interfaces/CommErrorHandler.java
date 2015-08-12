package com.designpattern.interfaces;

import com.designpattern.errorclass.CommunicationError;

/**
 * "通信错误"处理接口
 * @author ASUA
 *
 */
public interface CommErrorHandler {
	public void handle(CommunicationError commError);
}
