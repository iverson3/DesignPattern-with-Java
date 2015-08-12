package com.designpattern.main;

/**
 * 测试类
 * 模拟实际代码中错误的发生
 * @author ASUA
 */
public class ErrorHappen {
	public static void main(String[] args){
		
		
		/**
		 * 对数据库进行操作
		 * 模拟实际数据库操作中 错误的发生
		 * 错误类型：   ErrorConstant.ERROR_DBACCESS        数据库访问错误    
		 *           ErrorConstant.ERROR_COMMUNICATION   通信错误
		 */
		int tmp = ErrorConstant.ERROR_DBACCESS;
		
		GUISys sys = new GUISys();
		switch(tmp){
			case ErrorConstant.ERROR_DBACCESS:{
				sys.announceError(tmp);
				break;
			}
			case ErrorConstant.ERROR_COMMUNICATION:{
				sys.announceError(tmp);
				break;
			}
			default:{
				sys.announceError(tmp);
				break;
			}
		}
	}
}
