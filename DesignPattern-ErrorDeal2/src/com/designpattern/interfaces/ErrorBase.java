package com.designpattern.interfaces;

/**
 * 抽象的错误基类
 * @author ASUA
 */
public interface ErrorBase{
	/**
	 * 定义两个抽象方法
	 * 每个具体的错误类都可以有自己不同的对于这些抽象方法的实现
	 */
	public void handle();
	public String getInfo();
}