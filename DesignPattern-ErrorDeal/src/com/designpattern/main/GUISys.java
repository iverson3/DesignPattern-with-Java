package com.designpattern.main;

/* 省略了用户界面中的其他的功能 */
public class GUISys
{
    public void announceError(int errCode) {
		switch(errCode) {
			case ErrorConstant.ERROR_DBACCESS:
		        /**
		         * 通告管理者数据库访问错误的发生
		         * 使用简单的输出语句 模拟通知
		         */
				System.out.println("出现 数据库访问错误");
		        break;
			case ErrorConstant.ERROR_COMMUNICATION:
				/**
		        * 通告管理者通信错误的发生
		        * 使用简单的输出语句 模拟通知
		        */
				System.out.println("出现 通信错误");
		        break;
		    default:
		    	/**
		    	 * 其他错误
		    	 */
		    	System.out.println("出现 未知错误");
		        break;
		}
    }
}