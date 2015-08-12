package com.flyweight.classes;

/**
 * 用户类
 * 
 * 用于网站的客户账号 
 * 是"网站"类的外部状态
 * @author ASUA
 */
public class User {
	// 用户名(网站所有者)
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String GetName(){
		return this.name;
	}
}
