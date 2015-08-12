package com.adapter.classes;

import com.adapter.interfaces.ThreePlug;

/**
 * 笔记本电脑类
 * 测试类
 * @author ASUA
 */
public class NoteBook {
	
	private ThreePlug plug; 
	
	public NoteBook(ThreePlug plug){
		this.plug = plug;
	}
	
	/**
	 * 使用插座充电
	 * 这里 笔记本电脑只能使用三相插座充电
	 */
	public void charge(){
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		//实例化一个"国标二相插座"
		GBTwoPlug two = new GBTwoPlug();
		
		/**
		 * 调用二相转三相的插座适配器类
		 * 实现二相插座转三相插座
		 */
		ThreePlug three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		
		
		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();
	}

}
