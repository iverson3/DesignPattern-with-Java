package com.responsibility.main;

import com.responsibility.abstracts.Handler;
import com.responsibility.classes.ConcreteHandler1;
import com.responsibility.classes.ConcreteHandler2;
import com.responsibility.classes.ConcreteHandler3;
import com.responsibility.classes.ConcreteHandler4;

/**
 * 测试类
 * @author ASUA
 */
public class test {

	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		Handler h4 = new ConcreteHandler4();
		
		// 设置职责连的上家与下家 (构建职责连)
		h1.SetSuccessor(h2);
		h2.SetSuccessor(h3);
		h3.SetSuccessor(h4);
		
		int[] requests = {2, 5, 14, 22, 18, 3, 27, 20, 55 ,88};
		
		// 循环给最小处理者提交请求 (不同的数额，由不同权限处理者进行处理)
		for (int request : requests) {
			h1.HandleRequest(request);
		}
	}

}
