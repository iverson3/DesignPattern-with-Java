package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

/**
 * 通信错误类
 * 实现出现"通信错误"时的处理细节
 * @author ASUA
 */
public class CommunicationError implements ErrorBase {

	public void handle(ErrorHandler handler) {
        handler.handle(this);
    }
}
