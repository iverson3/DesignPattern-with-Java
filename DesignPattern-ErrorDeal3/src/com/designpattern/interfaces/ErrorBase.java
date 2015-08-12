package com.designpattern.interfaces;

/**
 * 抽象的错误基类
 * @author ASUA
 */
public interface ErrorBase{
	/**
	 * 定义两个抽象方法
	 * 在具体的错误类中，根据自身的需要来相应的实现这些方法
	 */
	public void guiHandle();
    public void logHandle();
}