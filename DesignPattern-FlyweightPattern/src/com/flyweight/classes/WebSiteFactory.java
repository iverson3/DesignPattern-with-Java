package com.flyweight.classes;

import java.util.Hashtable;

import com.flyweight.abstractclass.WebSite;

/**
 * 网站工厂类
 * 
 * @author ASUA
 */
public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<String, ConcreteWebSite>();
	
	// 获得网站分类
	public WebSite GetWebSiteCategory(String key){
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return ((WebSite)flyweights.get(key));
	}
	
	// 获得网站分类总数
	public int GetWebSiteCount(){
		return flyweights.size();
	}
}
