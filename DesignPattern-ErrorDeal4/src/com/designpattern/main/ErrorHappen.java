package com.designpattern.main;

import com.designpattern.errorclass.CommunicationError;
import com.designpattern.errorclass.DBAccessError;
import com.designpattern.errorclass.OtherError;

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
		int tmp = ErrorConstant.ERROR_COMMUNICATION;
		
		GUISys sys = new GUISys();
		LogSys lsys = new LogSys();
		switch(tmp){
			case ErrorConstant.ERROR_DBACCESS:{
				//sys.announceError(new DBAccessError());
				sys.handle(new DBAccessError());
				//lsys.announceError(new DBAccessError());
				lsys.handle(new DBAccessError());
				break;
			}
			case ErrorConstant.ERROR_COMMUNICATION:{
				//sys.announceError(new CommunicationError());
				sys.handle(new CommunicationError());
				//lsys.announceError(new CommunicationError());
				lsys.handle(new CommunicationError());
				break;
			}
			default:{
				//sys.announceError(new OtherError());
				sys.handle(new OtherError());
				//lsys.announceError(new OtherError());
				lsys.handle(new OtherError());
				break;
			}
		}
	}
}
