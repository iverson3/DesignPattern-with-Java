package com.flyweight.main;

import com.flyweight.abstractclass.WebSite;
import com.flyweight.classes.User;
import com.flyweight.classes.WebSiteFactory;

/**
 * 测试类
 * 
 * @author ASUA
 */
public class test {

	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.GetWebSiteCategory("产品展示");
		fx.Use(new User("小菜"));
		
		WebSite fy = f.GetWebSiteCategory("产品展示");
		fy.Use(new User("大鸟"));
		
		WebSite fz = f.GetWebSiteCategory("产品展示");
		fz.Use(new User("娇娇"));
		
		WebSite fl = f.GetWebSiteCategory("博客");
		fl.Use(new User("老顽童"));
		
		WebSite fm = f.GetWebSiteCategory("博客");
		fm.Use(new User("王帆"));
		
		WebSite fn = f.GetWebSiteCategory("博客");
		fn.Use(new User("张三"));
		
		System.out.println("网站分类总数是 " + f.GetWebSiteCount());
	}

}
