package com.template.abstractclass;

/**
 * 动物抽象类
 * @author ASUA
 */
public abstract class Animal{
	public String Shout() 
    { 
        return GetShout(); 
    }
	/**
	 * 抽象方法
	 * 留给子类根据具体需求去实现
	 * @return String
	 */
    protected abstract String GetShout();
}