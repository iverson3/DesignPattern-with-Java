package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;
import com.designpattern.interfaces.OtherErrorHandler;

/**
 * 未知类型错误类
 * 实现出现"未知类型错误"时的处理细节
 * @author ASUA
 */
public class OtherError implements ErrorBase {

	public void handle(ErrorHandler handler) {
		try {
			OtherErrorHandler commHandler = (OtherErrorHandler)handler;
            commHandler.handle(this);
        }catch(ClassCastException e){
        }
    }
}
