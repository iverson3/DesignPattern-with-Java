package com.adapter.classes;

import com.adapter.interfaces.ThreePlug;

/**
 * 二相转三相的插座适配器类
 * @author ASUA
 */
public class TwoPlugAdapter implements ThreePlug {
	/**
	 * "国标二相插座"对象实例
	 * 这里用到了"组合"
	 */
	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug plug){
		this.plug =plug;
	}
	
	@Override
	public void powerWithThree() {
		System.out.println("通过转换");
		//调用"国标二相插座"的powerWithTwo()方法
		plug.powerWithTwo();
	}

}
