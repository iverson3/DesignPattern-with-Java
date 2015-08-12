package com.designpattern.errorclass;

import com.designpattern.interfaces.ErrorBase;
import com.designpattern.interfaces.ErrorHandler;

/**
 * 未知类型错误类
 * 实现出现"未知类型错误"时的处理细节
 * @author ASUA
 */
public class OtherError implements ErrorBase {

	public void handle(ErrorHandler handler) {
        handler.handle(this);
    }
}
