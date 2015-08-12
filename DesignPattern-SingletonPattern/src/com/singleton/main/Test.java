package com.singleton.main;

import com.singleton.classes.Singleton;
import com.singleton.classes.Singleton2;

/**
 * 测试类
 * @author ASUA
 */
public class Test {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2){
			System.out.println("s1 s2 是同一个实例");
		}else{
			System.out.println("s1 s2 不是同一个实例");
		}
		
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if (s3 == s4){
			System.out.println("s3 s4 是同一个实例");
		}else{
			System.out.println("s3 s4 不是同一个实例");
		}
	}

}
