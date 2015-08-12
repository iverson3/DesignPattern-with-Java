package com.designpattern.interfaces;

import com.designpattern.errorclass.OtherError;

/**
 * "其他未知错误"处理接口
 * @author ASUA
 *
 */
public interface OtherErrorHandler {
	public void handle(OtherError dbError);
}
