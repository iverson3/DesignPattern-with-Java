package com.factory.classes;

import com.factory.abstractclass.AbstractFactory;
import com.factory.abstractclass.Operation;

public class ChinaOperationFactroy extends AbstractFactory{
	public Operation AddOperation()
    {
        return new ChinaOperationAdd();
    }

    public Operation SubOperation()
    {
        return new ChinaOperationSub();
    }
}
