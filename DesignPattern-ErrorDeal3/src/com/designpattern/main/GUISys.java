package com.designpattern.main;

import com.designpattern.interfaces.ErrorBase;

/* 省略了用户界面中的其他的功能 */
public class GUISys
{
    public void announceError(ErrorBase error) {
    	/**
    	 * 无需知道是哪一个具体的错误类型
    	 * 可以使用统一的方式来处理错误
    	 */
    	error.guiHandle();
    }
}