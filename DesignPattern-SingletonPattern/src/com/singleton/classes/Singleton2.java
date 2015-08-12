package com.singleton.classes;

/**
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就够了
 * 作用：保证整个应用程序中某一个实例有且只有一个
 * 类型： 饿汉模式   懒汉模式
 * @author ASUA
 */
public class Singleton2 {
	/**
	 * 唯一的一个对象实例
	 * (懒汉模式)
	 */
	private static Singleton2 instance;
	
	/**
	 * 将构造方法私有化
	 * 不允许外部直接使用new创建类的对象实例
	 */
	private Singleton2(){
		
	}
	
	/**
	 * 供外部获取唯一的一个对象实例
	 * @return
	 */
	public static Singleton2 getInstance(){
		//判断实例是否为空
		if (instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
