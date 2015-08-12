package com.adapter.classes;

import com.adapter.interfaces.ThreePlug;

/**
 * 二相插座适配器类
 * 采用继承方式的适配器
 * @author ASUA
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlug{

	@Override
	public void powerWithThree() {
		System.out.println("借助继承适配器");
		/**
		 * 调用父类中powerWithTwo()方法
		 * 使用二相电流供电
		 */
		this.powerWithTwo();
	}

}
