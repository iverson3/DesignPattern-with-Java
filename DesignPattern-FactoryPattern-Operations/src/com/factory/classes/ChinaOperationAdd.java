package com.factory.classes;

import com.factory.abstractclass.Operation;

/**
 * 中国加法运算 类
 * @author ASUA
 */
class ChinaOperationAdd extends Operation{
	
	/*public ChinaOperationAdd(double a, double b){
		NumA = a;
		NumB = b;
	}*/
	public double GetResult() {
		return NumA + NumB;
	}
}