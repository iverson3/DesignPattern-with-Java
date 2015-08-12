package com.factory.abstractclass;

import com.factory.classes.AmericaOperationFactroy;
import com.factory.classes.ChinaOperationFactroy;

/**
 * 抽象工厂类
 * @author ASUA
 */
public abstract class AbstractFactory {
	/**
	 * 获取对应的运算方法工厂类对象实例
	 * AmericaOperation/ChinaOperation
	 * @return
	 */
	public static AbstractFactory GetInstance()
    {
		/**
		 * 通过修改这句代码
		 * 能够决定使用AmericaOperation还是ChinaOperation
		 */
        AbstractFactory instance = new AmericaOperationFactroy();
        return instance;
    }
    public abstract Operation AddOperation();
    public abstract Operation SubOperation();
}
