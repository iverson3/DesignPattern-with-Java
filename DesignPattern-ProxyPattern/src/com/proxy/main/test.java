package com.proxy.main;

/**
 * subject抽象类
 * @author ASUA
 */
abstract class subject
{
	public abstract void Request();
}

/**
 * 真实Subject类
 * 继承自subject抽象类
 * @author ASUA
 */
class RealSubject extends subject
{
	public void Request(){
		System.out.println("真实的追求者");
    }
}

/**
 * Subject的代理类
 * 继承自subject抽象类
 * @author ASUA
 */
class Proxy extends subject
{
	RealSubject realsubject;
	public void Request(){
		if (realsubject == null){
			realsubject = new RealSubject();
        }
		//调用真实Subject类的方法
        realsubject.Request();
    }
}


/**
 * 测试类
 * @author ASUA
 */
class Test{
	public static void main(String args[]){
		//实例化代理类
		Proxy pr = new Proxy();
		//通过访问代理类的方法 间接的去访问真实类的方法
        pr.Request();
	}
}
