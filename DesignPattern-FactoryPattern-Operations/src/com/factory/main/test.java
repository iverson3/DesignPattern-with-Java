package com.factory.main;

import com.factory.abstractclass.AbstractFactory;
import com.factory.abstractclass.Operation;


class test{
	public static void main(String args[]){
		AbstractFactory af = AbstractFactory.GetInstance();
        Operation oper = af.AddOperation();
        oper.setNumA(3);
        oper.setNumB(2);
        double result = oper.GetResult();
        
        System.out.println(result);
	}
}