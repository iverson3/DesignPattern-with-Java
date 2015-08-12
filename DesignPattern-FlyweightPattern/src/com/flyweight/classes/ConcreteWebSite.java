package com.flyweight.classes;

import com.flyweight.abstractclass.WebSite;

/**
 * 具体网站类
 * 
 * @author ASUA
 */
public class ConcreteWebSite extends WebSite {
	// 网站类别名
	private String name = "";
	
	public ConcreteWebSite(String name){
		this.name = name;
	}
	
	// 通过Use()方法 将网站类的外部状态传递进来
	public void Use(User user) {
		System.out.println("网站分类：" + name + "   用户：" + user.GetName());
	}

}
